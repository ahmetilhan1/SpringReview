package com.cydeo.controller;

import com.cydeo.model.Employee;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping("/employees")
    public String empList(Model model){

        List<Employee> employeeList=new ArrayList<>();
        Faker faker = new Faker();
        employeeList.add(new Employee(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(50000,140000)));
        employeeList.add(new Employee(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(50000,140000)));
        employeeList.add(new Employee(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(50000,140000)));
        employeeList.add(new Employee(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(50000,140000)));

        model.addAttribute("employees",employeeList);
        return "employee-list";
    }

    @RequestMapping("/employee-info")
    public String empInfo(Model model){

        Employee emp1 = new Employee("Ahmet","Smith",90000);
        model.addAttribute("emp",emp1);

        return "/employee-info";
    }


}
