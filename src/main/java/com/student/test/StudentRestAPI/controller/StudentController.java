package com.student.test.StudentRestAPI.controller;

import com.student.test.StudentRestAPI.entity.Student;
import com.student.test.StudentRestAPI.service.StudentService;
import com.student.test.StudentRestAPI.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentServiceImpl;

    @PostMapping
    public Student createStudent(@RequestBody Student student){
      Student s=studentServiceImpl.createStudent(student);
      System.out.println("Student data :: "+  s);
      return s;

    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentServiceImpl.getAllStudents();
    }
}
