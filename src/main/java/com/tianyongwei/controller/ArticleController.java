package com.tianyongwei.controller;

import com.tianyongwei.entity.core.Article;
import com.tianyongwei.repo.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleRepo articleRepo;

    @RequestMapping("/list")
    public String list () {
        return "article/list";
    }

    @RequestMapping("/add/{title}")
    public String addArticle(@PathVariable String title) {
        Article a = new Article();
        a.setTitle(title);
        a = articleRepo.save(a);
        return a.getId() + ":" + a.getTitle();
    }


}