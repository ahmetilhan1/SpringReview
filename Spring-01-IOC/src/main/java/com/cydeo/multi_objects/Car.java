package com.cydeo.multi_objects;

import org.springframework.stereotype.Component;

public class Car {

    private String make;

    public String getMake(){return make;}

    public void setMake(String make){
        this.make = make;
    }
}
