package com.tianyongwei.controller;

import com.tianyongwei.entity.core.Article;
import com.tianyongwei.repo.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/subject")
public class SubjectController {

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