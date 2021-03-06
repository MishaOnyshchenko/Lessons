package com.testSpring.config;
import com.testSpring.controller.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration //собственно эта аннотация и говорит о том, что данный класс является Java
@EnableWebMvc //эта аннотация разрешает нашему проекту использовать MVC;
@ComponentScan({"com"}) //говорит, где искать компоненты проекта.

//WebMvcConfigurerAdapter — унаследовавшись от этого класса мы получим возможность сконфигурировать ResourceLocations.
public class WebAppConfig extends WebMvcConfigurerAdapter {

    //переопределив данный метод мы сможем указать где будут лежать ресурсы нашего проекта, такие как css, image, js и другие.
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/")
                .setCachePeriod(Integer.valueOf("31556926"));
    }

    @Bean //указывает на то что это инициализация бина, и он будет создан с помощью DI.
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/page/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

}