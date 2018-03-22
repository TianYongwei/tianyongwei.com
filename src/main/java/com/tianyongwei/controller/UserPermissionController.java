package com.tianyongwei.controller;

import com.tianyongwei.config.MyWebUtil;
import com.tianyongwei.entity.core.User;
import com.tianyongwei.repo.UserRepo;
import com.tianyongwei.service.UserService;
import com.tianyongwei.utils.BaseController;
import com.tianyongwei.utils.JsonResult;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 该controller访问需要登录权限，拦截器生效
 */
@Controller
@RequestMapping("/user/permission")
public class UserPermissionController extends BaseController{

    @RequestMapping(value = "/info", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult info(@RequestParam String id) {
        return renderSuccess("success",MyWebUtil.getCurrentUser());
    }
}
