package com.tianyongwei.controller;

import com.tianyongwei.repo.ArticleRepo;
import com.tianyongwei.utils.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/subject")
public class SubjectController  extends BaseController {

    @Autowired
    private ArticleRepo articleRepo;

    @RequestMapping("/list")
    public String list () {
        return "subject/list";
    }

    @RequestMapping("/add")
    public String add() {
        return "subject/add";
    }
}
