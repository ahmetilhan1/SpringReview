package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private String firstname;
    private String lastname;
    private Integer salary;
}
