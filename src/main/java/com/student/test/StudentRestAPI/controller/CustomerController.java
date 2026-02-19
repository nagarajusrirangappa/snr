package com.student.test.StudentRestAPI.controller;

import com.student.test.StudentRestAPI.entity.Customer;
import com.student.test.StudentRestAPI.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/insert") // insert the record into the DB.
    public Customer insertCustomer(@RequestBody Customer customer){
      //  Customer returnCustomer= customerService.insertCustomer(customer);
        return  customerService.insertCustomer(customer);

    }

    @GetMapping("/get/all")
    public List<Customer> getAllCustomerData(){
        return customerService.getAllCustoime();
    }


}
