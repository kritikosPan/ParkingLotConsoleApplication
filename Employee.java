package com.mycompany.parkinglotservicesapp;

import java.util.ArrayList;
import java.util.List;

public class Employee {

String name;

    Employee() {}

    public List<Employee> employees = new ArrayList<>();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name) {
        this.name = name;
    }
    
    
}
