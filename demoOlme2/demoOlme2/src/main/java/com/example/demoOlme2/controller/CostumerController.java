package com.example.demoOlme2.controller;

import com.example.demoOlme2.model.Customer;
import com.example.demoOlme2.service.CustomerServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CostumerController {
    private CustomerServiceImpl customerService;

    public CostumerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Customer> listAllCustomer(){
        return customerService.listAllCustomers();
    }

    @PostMapping("/customers/add")
    public String saveTaskC(@RequestBody Customer task){
        customerService.saveCustomer(task);
        return "customer saved sussesfull";
    }

    @GetMapping("/customers/{id}")
    public Customer listTaskByIdC(@PathVariable int id) {
        return customerService.findCustomerById(id);
    }
    @PutMapping("/customers/edit/{id}")
    public Customer updateTaskByIdC(@PathVariable int id, @RequestBody Customer task) {
        Customer taskUpdate=customerService.findCustomerById(id);
        taskUpdate.setName(task.getName());
        taskUpdate.setAddress(task.getAddress());

        customerService.saveCustomer(taskUpdate);
        return taskUpdate;
    }
    @DeleteMapping("/customers/delete/{id}")
    public String deleteTaskC(@PathVariable int id){
        customerService.deleteCustomer(id);
        return "customer deleted sussesfull";
    }
}
