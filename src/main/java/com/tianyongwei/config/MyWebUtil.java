package com.tianyongwei.config;

import com.tianyongwei.entity.core.User;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Component
public class MyWebUtil {
    public static HttpServletRequest getRequest(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }

    public static HttpSession getSession() {
        HttpSession session = getRequest().getSession();
        return session;
    }

    public static User getCurrentUser () {
        User user = (User) getSession().getAttribute("user");
        return user;
    }

    public static void saveUser2Session (User user) {
        getSession().setAttribute("user",user);
    }
}
