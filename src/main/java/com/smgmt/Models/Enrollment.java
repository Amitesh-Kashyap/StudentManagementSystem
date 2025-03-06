package com.smgmt.Models;

import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class Enrollment
{
    private String ID;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;
    private String enrollmentDate;

    Enrollment()
    {

    }
    
}
