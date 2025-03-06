package com.smgmt.Database;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smgmt.Models.Student;

public interface StudentDB extends JpaRepository<Student , Integer>
{
    Optional<Student> findByName(String name);
    List<Student> saveAll(List<Student> students_array);
    void deleteByName(String name);
    // In CRUD Repo, findById takes integer ID but we have taken it to be String
    // Hence, we defined another function
    Optional<Student> findById(String ID);
}
