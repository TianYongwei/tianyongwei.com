package com.tianyongwei.service;

import com.tianyongwei.config.MyWebUtil;
import com.tianyongwei.entity.core.Subject;
import com.tianyongwei.repo.SubjectRepo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepo subjectRepo;

    public Long add(String name, String intro, Long id) {
        if(StringUtils.isEmpty(name) || StringUtils.isEmpty(intro)) {
            return null;
        }
        Subject subject = new Subject();
        subject.setUserId(MyWebUtil.getCurrentUser().getId());
        subject.setName(name);
        subject.setIntro(intro);
        subject = subjectRepo.save(subject);
        return subject.getId();
    }
}
