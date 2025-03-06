package com.smgmt.Models;

import com.smgmt.Handlers.Generate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Designated Instructors")
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
