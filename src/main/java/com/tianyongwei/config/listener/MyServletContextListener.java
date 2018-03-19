package com.tianyongwei.config.listener;

import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class MyServletContextListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub
    }

    public void contextInitialized(ServletContextEvent sce) {
        // TODO Auto-generated method stub
    }

}
