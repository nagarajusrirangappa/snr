package com.student.test.StudentRestAPI.controller;

import com.student.test.StudentRestAPI.entity.Customer;
import com.student.test.StudentRestAPI.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    @GetMapping("/get/{cid}")
    public Customer getAllCustomerData(@PathVariable Long cid ){
        Optional<Customer> optionalCustomer=customerService.getByCustomerId(cid);

        if(optionalCustomer.isPresent()){
            return  optionalCustomer.get();
        }
        return optionalCustomer.orElseThrow();
    }


    @PatchMapping("/update/{cid}") //partially updated the data
    public Customer getAllCustomerData(@PathVariable Long cid,  @RequestBody Map<String, Object> updates){

        // Customer customer=customerService.updateByIdAndBody(cid, updates);
        return customerService.updateByIdAndBody(cid, updates);
    }


    @DeleteMapping
    public String deleteCustomerById( @RequestParam Long cid){
        return customerService.deleteCustomerById(cid);
    }

}
