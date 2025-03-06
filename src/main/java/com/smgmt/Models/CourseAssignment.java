package com.smgmt.Models;

import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class CourseAssignment
{
    private String ID;
    @ManyToOne
    private Course course;
    @ManyToOne
    private Instructor instructor;

    CourseAssignment()
    {

    }
    
}
