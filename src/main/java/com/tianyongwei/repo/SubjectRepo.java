package com.tianyongwei.repo;

import com.tianyongwei.entity.core.Article;
import com.tianyongwei.entity.core.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject, Long> {

}
