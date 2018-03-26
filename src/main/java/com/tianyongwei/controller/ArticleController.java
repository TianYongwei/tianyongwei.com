package com.tianyongwei.controller;

import com.tianyongwei.entity.core.Article;
import com.tianyongwei.service.ArticleService;
import com.tianyongwei.utils.BaseController;
import com.tianyongwei.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleController extends BaseController {

    @Autowired
    private ArticleService articleService;


    @RequestMapping("/list/subject/{subjectId}")
    public String list (@PathVariable Long subjectId, Model model) {
        List<Article> articles = articleService.myArticles(subjectId);
        model.addAttribute("articles",articles);
        return "article/list";
    }

    @RequestMapping("/add")
    public String add() {
        return "article/add";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult add_post(@RequestParam Long subjectId, @RequestParam String title , @RequestParam String content) {
        Article article = articleService.add(subjectId, title, content);
        return renderSuccess(article);
    }

    @RequestMapping("/read/{articleId}")
    public String read(Model model,@PathVariable Long articleId) {
        Article article = articleService.articleInfo(articleId);
        model.addAttribute("article",article);
        return "article/read";
    }

    @RequestMapping(value = "/del",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult del(@RequestParam Long id) {
        articleService.del(id);
        return renderSuccess();
    }

    @RequestMapping("/edit/{articleId}")
    public String edit(@PathVariable Long articleId,Model model) {
        model.addAttribute("articleId",articleId);
        return "article/edit";
    }

    @RequestMapping(value="/saveEdit",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult saveEdit(@RequestParam Long id, @RequestParam String title, @RequestParam String content) {
        Article article = articleService.saveEdit(id, title, content);
        return renderSuccess(article);
    }

    @RequestMapping(value = "/info/{articleId}", method = RequestMethod.POST)
    public JsonResult info(@PathVariable Long articleId) {
        Article article = articleService.articleInfo(articleId);
        return renderSuccess(article);
    }
}
