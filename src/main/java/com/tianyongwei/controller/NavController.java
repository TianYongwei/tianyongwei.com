package com.tianyongwei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nav")
public class NavController {

  @RequestMapping("/list")
  public String list () {
    return "nav/list";
  }

  @RequestMapping("/add")
  public String add() {
    return "nav/add";
  }

  @RequestMapping("/read")
  public String read() {
    return "nav/read";
  }
}
