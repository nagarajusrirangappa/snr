package com.student.test.StudentRestAPI.service;

import com.student.test.StudentRestAPI.entity.Customer;
import com.student.test.StudentRestAPI.repository.CustomerRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Component
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepositry customerRepositry;
    @Override
    public List<Customer> getAllCustoime() {
        return customerRepositry.findAll();
    }

    // save the data or create the data or insert the data
    @Override
    public Customer insertCustomer(Customer customer) {

        return customerRepositry.save(customer); //Object Relation Mapping ORM -- Hibernate/JPA

    }
}
