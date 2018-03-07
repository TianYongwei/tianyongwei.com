package com.tianyongwei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cheat")
public class CheatController {

  @RequestMapping("/list")
  public String list () {
    return "cheat/list";
  }

  @RequestMapping("/add")
  public String add() {
    return "cheat/add";
  }

  @RequestMapping("/read")
  public String read() {
    return "cheat/read";
  }
}
