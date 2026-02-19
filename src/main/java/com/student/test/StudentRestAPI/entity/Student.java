package com.student.test.StudentRestAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


/*2 Rest APIs need to be written and compiled in Postman.
        One to post the data and another one to retrieve the data.
        You can use H2 Database or anyother database to post and retrieve the data.
        Testcases for both these Rest APIs should be written and executed successfully in the IDE.

        Name of the Project - Student

        Name,Contact Number,email id, Location
        shan,9840142282,eakshan@gmail.com,Bangalore*/
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String contactNumber;
    private String email;

    private String location;
}
