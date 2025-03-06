package com.smgmt.Models;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class CourseAssignment
{
    @Id
    private String ID;
    @ManyToOne
    private Course course;
    @ManyToOne
    private Instructor instructor;

    CourseAssignment()
    {

    }
    
}
