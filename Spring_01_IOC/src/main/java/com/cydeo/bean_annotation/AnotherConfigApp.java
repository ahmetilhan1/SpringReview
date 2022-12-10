package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AnotherConfigApp {


    @Bean
    String str(){
        return "Spring Short Videos";
    }

    @Bean
    Integer integer(){
        return 120;
    }
}
