package com.tianyongwei.service;

import com.tianyongwei.config.MyWebUtil;
import com.tianyongwei.entity.core.Subject;
import com.tianyongwei.repo.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepo subjectRepo;

    public void add(String name, String intro, Long id) {
        Subject subject = new Subject();
        subject.setUserId(MyWebUtil.getCurrentUser().getId());
        subject.setName(name);
        subject.setIntro(intro);
        subjectRepo.save(subject);
    }
}
