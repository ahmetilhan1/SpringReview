package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping("/new")
    public String getInfo(@RequestParam(required = false,defaultValue = "TEST") String firstName, Model model){

        System.out.println(firstName);
        model.addAttribute("fname",firstName);
        return "emp-register.html";

    }

    @RequestMapping("/add/{firstName}")
    public String getInfo2(@PathVariable String firstName,Model model){
        model.addAttribute("fname",firstName);

        return "emp-register.html";
    }
}
