package com.smgmt.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Enrollments Upto Date")
public class Enrollment
{
    @Id
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
