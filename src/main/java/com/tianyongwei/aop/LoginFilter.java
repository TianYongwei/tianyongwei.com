//package com.tianyongwei.aop;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class LoginFilter {
//
//  @Pointcut("execution(* add(..))")
//  private void pointcut() {}
//
//  @Before("com.elim.test.spring.aop.MyAspect.pointcut()")
//  private void before(JoinPoint joinPoint) {
//    System.out.println(joinPoint.getTarget() + "----------------------Before---------------------");
//  }
//}
