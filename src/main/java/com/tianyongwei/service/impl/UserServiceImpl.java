package com.tianyongwei.service.impl;

import com.tianyongwei.entity.core.User;
import com.tianyongwei.repo.UserRepo;
import com.tianyongwei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public boolean hasSignupByEmail(String email) {
        Boolean isVerified = true;
        List<User> users = userRepo.findByEmailAndIsVerified(email,isVerified)
        return users.size() > 0;
    }
}
