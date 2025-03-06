package com.smgmt.Service;

import java.util.List;
import java.util.Optional;

import com.smgmt.Database.StudentDB;
import com.smgmt.Models.Student;

public class Serv_Students
{
    private StudentDB obj;

    public Optional<Student> find_student_by_name(String name)
    {
        return obj.findByName(name);
    }

    public Optional<Student> find_student_by_id(String id)
    {
        return obj.findById(id);
    }

    public List<Student> save_all(List<Student> students_array)
    {
        return obj.saveAll(students_array);
    }

    public void delete_all_by_name(String name)
    {
        obj.deleteByName(name);
    }

    public void save_student(Student student)
    {
        obj.saveAndFlush(student);
    }
}
