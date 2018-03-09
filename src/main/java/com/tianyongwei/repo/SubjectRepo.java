package com.tianyongwei.repo;

import com.tianyongwei.entity.core.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Article, Long> {

}
