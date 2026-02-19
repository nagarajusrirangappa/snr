package com.student.test.StudentRestAPI.service;

import com.student.test.StudentRestAPI.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
 Student createStudent(Student student);
 List<Student> getAllStudents();

}
