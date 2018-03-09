package com.tianyongwei.controller;

import com.tianyongwei.utils.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/card")
public class CardController extends BaseController {

  @RequestMapping("/list")
  public String list () {
    return "card/list";
  }

  @RequestMapping("/add")
  public String add() {
    return "card/add";
  }

  @RequestMapping("/read")
  public String read() {
    return "card/read";
  }
}
