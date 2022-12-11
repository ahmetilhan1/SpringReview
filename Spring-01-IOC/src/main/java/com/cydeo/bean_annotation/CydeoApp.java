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

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,AnotherConfigApp.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);

        ft.createAccount();
        ft.createAccount();

        PartTimeMentor pt = container.getBean(PartTimeMentor.class);

        pt.createAccount();

        String str = container.getBean(String.class);

        System.out.println(str);

        Integer integer = container.getBean(Integer.class);

        System.out.println(integer);






    }





}
