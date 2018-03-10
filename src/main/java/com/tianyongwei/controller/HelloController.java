package com.tianyongwei.controller;

import com.tianyongwei.utils.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HelloController extends BaseController{

    @RequestMapping("/")
    public String hello(HttpServletResponse response, HttpSession session) {
        session.setAttribute("tyw","anything");
        return "index";
    }

    @RequestMapping("/err")
    public String error(HttpServletResponse response, HttpSession session) {
        return "error";
    }
}
