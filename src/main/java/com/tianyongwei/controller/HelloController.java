package com.tianyongwei.controller;

import com.tianyongwei.utils.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController extends BaseController{

    @RequestMapping("/")
    public String hello() {
        return "index";
    }

    @RequestMapping("/1")
    public String hello1() {
        return "index-iviewui";
    }


}
