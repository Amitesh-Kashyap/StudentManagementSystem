package com.smgmt.Database;

import com.smgmt.Models.Course;
import com.smgmt.Models.Student;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDB extends JpaRepository<Course , Integer>
{
    Optional<Course> findByName(String courseName);
    List<Course> saveAll(List<Course> courses_array);
    void deleteByName(String name);    
}
