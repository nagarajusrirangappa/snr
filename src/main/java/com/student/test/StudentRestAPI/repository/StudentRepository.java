package com.student.test.StudentRestAPI.repository;

import com.student.test.StudentRestAPI.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
