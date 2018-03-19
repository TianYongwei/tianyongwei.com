package com.tianyongwei.config.Interceptor;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@Configuration
public class InterceptorConfigurerAdapter extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 添加路径
        // excludePathPatterns 排除路径
        registry.addInterceptor(new PermissionInterceptor()).addPathPatterns("/*");
        super.addInterceptors(registry);
    }
}
