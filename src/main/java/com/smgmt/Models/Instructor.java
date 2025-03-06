package com.smgmt.Models;

import com.smgmt.Handlers.Generate;

import lombok.Data;

@Data
public class Instructor
{
    private String ID;
    private String name;
    private String email;
    private String department;
    
    Instructor(String name , String email, String department)
    {
        ID = Generate.generate_ID();
        this.name = name;
        this.email = email;
        this.department = department;
    }
}
