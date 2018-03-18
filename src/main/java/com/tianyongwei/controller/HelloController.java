package com.tianyongwei.controller;

import com.tianyongwei.utils.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HelloController extends BaseController{

    @RequestMapping("/")
    public String hello(HttpServletRequest request,HttpServletResponse response, HttpSession session) {
        System.out.println(session.getId());
        session.setAttribute("test","test2");
        session.setMaxInactiveInterval(5);
        session = request.getSession();
        System.out.println(session.getId());
        return "index";
    }

    @RequestMapping("/err")
    public String error(HttpServletResponse response, HttpSession session) {
        return "error";
    }
}
