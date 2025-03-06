package com.smgmt.Database;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smgmt.Models.Course;
import com.smgmt.Models.CourseAssignment;
import com.smgmt.Models.Instructor;

public interface CourseAssignmentDB extends JpaRepository<CourseAssignment , Integer>
{
    Optional<CourseAssignment> findByCourse(Course course);
    List<CourseAssignment> saveAll(List<CourseAssignment> courseassignment_array);
    void deleteByCourse(Course course);    
}
