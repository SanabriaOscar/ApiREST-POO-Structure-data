package com.example.TestParameta.controller;

import com.example.TestParameta.exceptions.AgeMayor18Exception;
import com.example.TestParameta.model.Employee;
import com.example.TestParameta.service.EmployeeServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/employees")
    public List<Employee> listAllEmployees(){
        return employeeService.ListAllEmployee();
    }
    @PostMapping("/employees/add")
    public String SaveEmployeeC(@RequestBody Employee employee){
        return  employeeService.SaveEmployee(employee);

    }
}
