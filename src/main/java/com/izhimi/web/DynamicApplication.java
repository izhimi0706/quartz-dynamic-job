package com.izhimi.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.izhimi.service.TestService;
import com.izhimi.service.impl.TestServiceImpl;

/**
 * @author izhimi
 */
@SpringBootApplication
@ImportResource("classpath:beanRefContext.xml")
public class DynamicApplication {

    @Bean
    TestService testService() {
        return new TestServiceImpl();
    }
    
    public static void main(String[] args) {
        SpringApplication.run(DynamicApplication.class, args);
    }
}
