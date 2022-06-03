package com.example.demoOlme2.service;

import com.example.demoOlme2.model.Customer;

import java.util.List;

public interface ICustomerService {
    public List<Customer>listAllCustomers();
    public void  saveCustomer(Customer customer);
    public Customer findCustomerById(int id);
    public  void deleteCustomer(int id);
}
