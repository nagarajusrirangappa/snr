package com.student.test.StudentRestAPI.repository;

import com.student.test.StudentRestAPI.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositry extends JpaRepository<Customer, Long> {
    //@Query("SELECT c FROM customer_1 c where c.city=:city")
   /* @Query("SELECT c FROM Customer c where c.city=:city")
    Customer findbyCity(@Param("city") String city);*/
}
