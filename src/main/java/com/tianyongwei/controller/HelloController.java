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
        session.setAttribute("tyw","anything");
        System.out.println(session.getId());
        Cookie cookie = new Cookie("tyw","tywvalue");
        cookie.setHttpOnly(true);
        response.addCookie(cookie);
        Cookie cookie1 = new Cookie("ssss","123123123");
        cookie1.setHttpOnly(true);
        response.addCookie(cookie1);
        System.out.println(request.getCookies()[0].getValue());
        System.out.println(request.getCookies()[1].getValue());
        return "index";
    }

    @RequestMapping("/err")
    public String error(HttpServletResponse response, HttpSession session) {
        return "error";
    }
}
