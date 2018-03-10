package com.tianyongwei.service.impl;

import com.tianyongwei.entity.core.User;
import com.tianyongwei.repo.UserRepo;
import com.tianyongwei.service.UserService;
import com.tianyongwei.utils.EmailUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.mail.EmailException;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    /**
     * 查看邮箱是否被占用
     * @param email
     * @return
     */
    @Override
    public boolean hasSignupByEmail(String email) {
        Boolean isVerified = true;
        List<User> users = userRepo.findByEmailAndIsVerified(email,isVerified);
        return users.size() > 0;
    }

    @Override
    public User signup(String email, String psd1) {
        List<User> users = userRepo.findByEmailAndIsVerified(email,false);

        //发送验证邮件
        String randomCode = RandomStringUtils.randomAlphanumeric(5);
        try {
            EmailUtil.sendSignupEmail_text(email,randomCode);
        } catch (EmailException e) {
            e.printStackTrace();
        }

        //保存用户
        User user = null;
        if(users.size() == 1) {
            user = users.get(0);
        } else if(users.size() == 0) {
            user = new User();
        } else {
            throw new IllegalStateException("同一个邮箱查出多个用户");
        }
        user.setEmail(email);
        user.setPassword(DigestUtils.md5Hex("sa" + psd1 + "lt"));
        user.setUsername(email);
        user.setCreateTime(new java.sql.Date(new Date().getTime()));
        user.setLevel("1");
        user.setvCode(randomCode);
        user.setVerified(false);
        user.setVerifiedTime(new java.sql.Date(new DateTime().plusMinutes(5).getMillis()));
        user = userRepo.saveAndFlush(user);
        return user;
    }

    public static void main(String[] args) {
        DateTime dt = new DateTime().plusMinutes(5);
        System.out.println(dt.getMillis());

    }
}
