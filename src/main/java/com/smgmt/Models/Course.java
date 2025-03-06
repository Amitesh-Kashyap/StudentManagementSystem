package com.smgmt.Models;

import com.smgmt.Handlers.Generate;

import lombok.Data;

@Data
public class Course
{
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
