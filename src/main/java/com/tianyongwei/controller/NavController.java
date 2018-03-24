package com.tianyongwei.controller;

import com.tianyongwei.config.MyWebUtil;
import com.tianyongwei.entity.core.Subject;
import com.tianyongwei.repo.SubjectRepo;
import com.tianyongwei.utils.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/nav")
public class NavController extends BaseController {

  @Autowired
  private SubjectRepo subjectRepo;

  @RequestMapping("/subject/{subjectId}")
  public String read(@PathVariable Long subjectId) {
    Subject subject = subjectRepo.findOne(subjectId);
    if(subject == null || MyWebUtil.getCurrentUser().getId() != subject.getUserId()) {
      return "nopermission";
    }
    return "nav/read";
  }

}
