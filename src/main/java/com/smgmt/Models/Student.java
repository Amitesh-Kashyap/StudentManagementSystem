package com.smgmt.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Student_Records")
public class Student
{
    private String id;
    private String name;
    private int age;
    private String email;
    Student(String name , int age , String email)
    {
        this.name = name;
        this.age = age;
        this.email = email;

    }
    
}
