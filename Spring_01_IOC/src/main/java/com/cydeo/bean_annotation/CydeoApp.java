package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) { //without bean

        /*
        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        PartTimeMentor partTimeMentor = new PartTimeMentor();

        fullTimeMentor.createAccount();

        partTimeMentor.createAccount();
        */

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);

        ft.createAccount();

        PartTimeMentor pt = container.getBean(PartTimeMentor.class);

        pt.createAccount();


    }





}
