package com.cydeo.controller;

import com.cydeo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/employees")
    public String empList(Model model){

        model.addAttribute("name","Mike");
        return "employee-list.html";
    }

    @RequestMapping("/employee-info")
    public String empInfo(Model model){

        Employee emp1 = new Employee("Mike","Smith",90000);
        model.addAttribute("emp",emp1);

        return "/employee-info.html";
    }


}
