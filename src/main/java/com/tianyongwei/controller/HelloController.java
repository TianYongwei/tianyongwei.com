package com.tianyongwei.controller;

import com.tianyongwei.utils.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloController extends BaseController{

    @RequestMapping("/")
    public String hello(HttpServletResponse response) {
        return "index";
    }
}
