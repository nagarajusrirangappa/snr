package com.student.test.StudentRestAPI.service;

import com.student.test.StudentRestAPI.entity.Customer;
import com.student.test.StudentRestAPI.repository.CustomerRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.DefaultEditorKit;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    @Override
    public Optional<Customer>  getByCustomerId(Long cid) {
        Optional<Customer>  optionalCustomer=customerRepositry.findById(cid);
        return optionalCustomer;
    }

    @Override
    public Customer updateByCity(String city) {
        // Customer obj=customerRepositry.findbyCity(city);

        // return obj;
        return null;
    }

    @Override
    public Customer updateByIdAndBody(Long cid, Map<String, Object> updates) {
    /*
        Optional<Customer> optionalCustomer =customerRepositry.findById(cid);
        Customer customerObj= optionalCustomer.get(); // we can get existing record from DB based on cid.

        //doing front end side which property is coming we need to check

        if(updates.containsKey("customerName")){
            customerObj.setCustomerName((String) updates.get("customerName"));
        }else if(updates.containsKey("city")){
            customerObj.setCity((String)updates.get("city"));
        }
        Customer  customer =customerRepositry.save(customerObj);
        return customer;


     */
        return  customerRepositry.findById(cid)
                .map(customer -> {
                    if(updates.containsKey("customerName")){
                        customer.setCustomerName((String) updates.get("customerName"));
                    }else if(updates.containsKey("city")){
                        customer.setCity((String)updates.get("city"));
                    }
                    return customerRepositry.save(customer);
                }).orElse(null);



    }

    @Override
    public String deleteCustomerById(Long cid) {
        customerRepositry.deleteById(cid);
        return "deleted successfully.";
    }
}
