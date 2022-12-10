package com.cydeo.repository;


import com.cydeo.model.Java;
import org.springframework.stereotype.Component;

@Component
public class DBJavaRepository implements JavaRepository {


    @Override
    public int returnHours() {
        Java java = new Java(30);
        return java.getTeachingHours();
    }
}
