package com.smgmt.Service;

import java.util.List;
import java.util.Optional;

import com.smgmt.Database.CourseDB;
import com.smgmt.Models.Course;

public class Serv_Courses
{
    private CourseDB obj;

    public Optional<Course> find_course_by_name(String courseName)
    {
        return obj.findByName(courseName);
    }

    public Optional<Course> find_course_by_id(String courseId)
    {
        return obj.findById(courseId);
    }

    public List<Course> save_all(List<Course> courses_array)
    {
        return obj.saveAll(courses_array);
    }

    public void delete_all_by_name(String name)
    {
        obj.deleteByName(name);
    }

    // Something new
    public void save_course(Course course)
    {
        obj.saveAndFlush(course);
    }
    
}
