package com.tianyongwei.service;

import com.tianyongwei.config.MyWebUtil;
import com.tianyongwei.entity.core.Article;
import com.tianyongwei.repo.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepo articleRepo;

    public List<Article> myArticles(Long subjectId) {
        return articleRepo.findBySubjectIdAndUserIdAndIsDrop(subjectId, MyWebUtil.getCurrentUser().getId(),false);
    }

    public Article articleInfo(Long articleId) {
        Article article = articleRepo.findOne(articleId);
        return article;
    }

    public void del(Long id) {
        Article article = articleRepo.findOne(id);
        article.setDrop(true);
        articleRepo.saveAndFlush(article);
    }
}
