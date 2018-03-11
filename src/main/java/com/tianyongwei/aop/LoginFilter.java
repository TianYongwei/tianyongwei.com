package com.tianyongwei.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Aspect
@Component
public class LoginFilter {

  @Pointcut("execution(* com.tianyongwei.controller.UserController.*(..))")
  private void pointcut() {}

  @Before("pointcut()")
  private void before(JoinPoint joinPoint) throws IOException {
      //直接拦截 重定向
      HttpServletResponse response = null;
      HttpSession session = null;
      for (Object param : joinPoint.getArgs()) {
          if (param instanceof HttpServletResponse) {
              response = (HttpServletResponse) param;
          }
          if (param instanceof HttpSession) {
              session = (HttpSession) param;
          }
      }
      //如果session中没有特定信息则跳转到错误页面
//      if(session == null || StringUtils.isEmpty(session.getAttribute("tyw"))) {
//        response.sendRedirect("/err");
//      } else {
//        //
//      }
  }

}
