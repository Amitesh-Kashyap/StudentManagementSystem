package com.smgmt.Database;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smgmt.Models.Instructor;

public interface InstructorDB extends JpaRepository<Instructor , Integer>
{
    Optional<Instructor> findByName(String name);
    List<Instructor> saveAll(List<Instructor> instructors_array);
    void deleteByName(String name);
    
}
