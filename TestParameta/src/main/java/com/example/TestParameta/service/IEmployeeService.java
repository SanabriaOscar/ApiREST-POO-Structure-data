package com.example.TestParameta.service;

import com.example.TestParameta.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> ListAllEmployee();
    String SaveEmployee(Employee employee);
    Employee findByIdEmployee(int id);
    void deleteEmployee(int id);
}
