package com.example.Juxta.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourceConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations(
                "file:////D:/vlad_smk/it/java/Juxta_demo/src/main/resources/static/"
        ); // це path для мого пк, вам потрібен свій, а на далі нам потрібен якийсь спільний ⚒️
    }
}
