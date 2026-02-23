package com.student.test.StudentRestAPI.service;

import com.student.test.StudentRestAPI.entity.Customer;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface CustomerService {

     List<Customer> getAllCustoime();

     Customer insertCustomer(Customer customer);

     Optional<Customer> getByCustomerId(Long cid);

     Customer updateByCity(String city);

     Customer updateByIdAndBody(Long cid, Map<String, Object> updates);

     String deleteCustomerById(Long cid);
}
