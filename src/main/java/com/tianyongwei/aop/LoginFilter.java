package com.tianyongwei.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Aspect
@Component
public class LoginFilter {

  @Pointcut("execution(* com.tianyongwei.controller.HelloController.*(..))")
  private void pointcut() {}

  @Before("pointcut()")
  private void before(JoinPoint joinPoint) throws IOException {
      //直接拦截 重定向
      HttpServletResponse response = null;
      for (Object param : joinPoint.getArgs()) {
          if (param instanceof HttpServletResponse) {
              response = (HttpServletResponse) param;
          }
      }
      response.sendRedirect("/user/signin");
  }

}
