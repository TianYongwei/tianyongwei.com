package com.tianyongwei.controller;

import com.tianyongwei.utils.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

    //注册页面
    @RequestMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("aaa","123");
        return "user/signup";
    }

    //登录页面
    @RequestMapping("/signin")
    public String signin(Model model) {
        model.addAttribute("aaa","123");
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
