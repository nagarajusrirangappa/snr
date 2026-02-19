package com.student.test.StudentRestAPI.controllertest;

import com.student.test.StudentRestAPI.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StudentControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testCreateStudent(){
        String url="http://localhost:"+port+"/api/students";
        Student student= new Student();
        student.setName("shan");
        student.setEmail("shan@gmail.com");
        student.setContactNumber("8181818135");
        student.setLocation("Bangalore");
        ResponseEntity<Student>  response=restTemplate.postForEntity(url, student,Student.class);
        assertThat(response.getBody().getName()).isEqualTo("shan");

    }

    @Test
    public void testgetStudents(){
        String url="http://localhost:"+port+"/api/students";
        ResponseEntity<List>  response=restTemplate.getForEntity(url, List.class);
        assertThat(response.getBody()).isNotEmpty();
    }

}
