package com.firstassignment.dockerproject.repository;

import com.firstassignment.dockerproject.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface StudentRepo extends CrudRepository<Student, Integer> {

    List<Student> findAll();
}
