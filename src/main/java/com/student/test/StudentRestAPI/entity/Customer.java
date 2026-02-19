package com.student.test.StudentRestAPI.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "customer_1")
public class Customer {

   // @Column(name = "customer_id")
    @Id //create in primary key oin the DB.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    //@Column(name = "customer_name")
    private String customerName;


    //@Column(name = "customer_city")
    private String city;

    public Customer(Long customerId, String customerName, String city) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.city = city;
    }

    public Customer(){}

    public Long getCustomerId() {
        return customerId;
    }


    public String getCustomerName() {
        return customerName;
    }


    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
