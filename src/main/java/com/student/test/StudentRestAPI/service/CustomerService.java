package com.student.test.StudentRestAPI.service;

import com.student.test.StudentRestAPI.entity.Customer;

import java.util.List;

public interface CustomerService {

     List<Customer> getAllCustoime();

     Customer insertCustomer(Customer customer);
}
