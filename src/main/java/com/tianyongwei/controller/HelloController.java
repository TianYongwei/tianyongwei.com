package com.tianyongwei.controller;

import com.tianyongwei.utils.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController extends BaseController{

    @RequestMapping("/")
    public String hello() {
        return "index";
    }

    @RequestMapping("/err")
    public String error() {
        return "error";
    }
}
