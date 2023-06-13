package com.example.Juxta.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourceConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String path = "file:////D:/Projects/Juxta_demo/src/main/resources/static/";
        registry.addResourceHandler("/static/**").addResourceLocations(path);
    }
}
