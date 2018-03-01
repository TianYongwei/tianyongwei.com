package com.tianyongwei.controller;

import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "index";
    }

    @RequestMapping("/1")
    public String hello1() {
        return "index-iviewui";
    }


}
