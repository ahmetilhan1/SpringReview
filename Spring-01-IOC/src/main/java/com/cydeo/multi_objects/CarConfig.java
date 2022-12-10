package com.cydeo.multi_objects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
public class CarConfig {

    @Bean(name = "c1")  //spring feature 'labeling'
    @Primary //to set a default
    Car car1(){
        Car c = new Car();
        c.setMake("Audi");
        return c;
    }
    @Bean(name = "c2")
    Car car2(){
        Car c = new Car();
        c.setMake("Tesla");
        return c;
    }


}
