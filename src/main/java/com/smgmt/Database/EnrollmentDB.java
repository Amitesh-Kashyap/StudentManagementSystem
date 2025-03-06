package com.smgmt.Database;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smgmt.Models.Course;
import com.smgmt.Models.Enrollment;

public interface EnrollmentDB extends JpaRepository<Enrollment , Integer>
{
    Optional<Enrollment> findByName(String courseName);
    List<Course> saveAll(List<Course> courses_array);
    void deleteByName(String name);
    
}
