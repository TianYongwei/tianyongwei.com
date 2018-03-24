package com.tianyongwei.controller;

import com.tianyongwei.utils.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cheat")
public class CheatController extends BaseController {

  @RequestMapping("/list")
  public String list () {
    return "cheat/list";
  }

  @RequestMapping("/edit")
  public String add() {
    return "cheat/edit";
  }

  @RequestMapping("/read")
  public String read() {
    return "cheat/read";
  }
}
