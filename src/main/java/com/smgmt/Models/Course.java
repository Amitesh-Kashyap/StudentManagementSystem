package com.smgmt.Models;

import com.smgmt.Handlers.Generate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Available Courses")
public class Course
{
    @Id
    private String ID;
    private String courseName;
    private String Description;

    Course(String courseName, String Description)
    {
        ID = Generate.generate_ID();
        this.courseName = courseName;
        this.Description = Description;
    }
    
}
