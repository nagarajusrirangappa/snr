package com.student.test.StudentRestAPI.repository;

import com.student.test.StudentRestAPI.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositry extends JpaRepository<Customer, Long> {
}
