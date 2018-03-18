package com.tianyongwei.config.listener;

import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("ServletContext销毁....");
    }

    public void contextInitialized(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("ServletContext初始化...");
    }

}
