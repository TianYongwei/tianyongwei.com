package com.tianyongwei.controller;

import com.tianyongwei.config.MyWebUtil;
import com.tianyongwei.entity.core.Subject;
import com.tianyongwei.repo.ArticleRepo;
import com.tianyongwei.repo.SubjectRepo;
import com.tianyongwei.service.SubjectService;
import com.tianyongwei.utils.BaseController;
import com.tianyongwei.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/subject")
public class SubjectController  extends BaseController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/list")
    public String list () {
        return "subject/list";
    }

    @RequestMapping("/add")
    public String add() {
        return "subject/add";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult add_post(@RequestParam String name, @RequestParam String intro) {
        subjectService.add(name, intro, MyWebUtil.getCurrentUser().getId());
        return renderSuccess();
    }
}
