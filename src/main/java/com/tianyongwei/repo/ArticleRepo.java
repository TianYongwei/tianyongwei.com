package com.tianyongwei.repo;

import com.tianyongwei.entity.core.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepo extends JpaRepository<Article, Long> {

}
