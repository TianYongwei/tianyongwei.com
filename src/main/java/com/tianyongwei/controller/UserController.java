package com.tianyongwei.controller;

import com.tianyongwei.entity.core.User;
import com.tianyongwei.repo.UserRepo;
import com.tianyongwei.service.UserService;
import com.tianyongwei.utils.BaseController;
import com.tianyongwei.utils.JsonResult;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.digester.Digester;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserService userService;

    //注册页面
    @RequestMapping("/signup")
    public String signup(Model model, HttpSession session, HttpServletResponse response) {
        return "user/signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult signup_post(@RequestParam String email, @RequestParam String psd1, @RequestParam String psd2) {
        /**
         * 异常情况：
         * 0、邮箱格式错误
         * 1、邮箱已注册成功,被占用
         * 2、密码不一致
         * 3、密码长度
         *
         * 步骤：
         * 1、验证异常情况
         * 2、已注册未验证，验证是否过期
         * 3、发送邮箱验证
         * 4、插入数据或更新数据
         */
        //使用apache的邮箱验证类
        EmailValidator emailValidator = EmailValidator.getInstance();
        if(!emailValidator.isValid(email)) {
            return renderError("邮箱不合法");
        }

        if(userService.hasSignupByEmail(email)) {
            return renderError("该邮箱已经注册");
        }

        if(StringUtils.isEmpty(psd1) || StringUtils.isEmpty(psd2)){
            return renderError("密码不能为空");
        }

        if(!psd1.equals(psd2)) {
            return renderError("两次密码不一致");
        }

        if(psd1.length() < 6 || psd1.length() > 18) {
            return renderError("长度需要在6-18位之间");
        }

        User user = userService.signup(email,psd1);
        System.out.println(user.getId());
        return renderSuccess("http://mail." + email.split("@")[1]);
    }

    //登录页面
    @RequestMapping("/signin")
    public String signin(Model model, HttpSession session ,HttpServletResponse response) {
        model.addAttribute("aaa","123");
//        session.setAttribute("tyw", new Date().toString());
        return "user/signin";
    }


    //注册接口

    //登录页面

    //登录接口

    //修改密码页面

    //修改密码接口

    //用户查询接口

    //用户列表接口（分页）
}
