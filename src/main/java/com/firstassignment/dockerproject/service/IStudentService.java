package com.firstassignment.dockerproject.service;

import com.firstassignment.dockerproject.model.Student;

import java.util.List;

public interface IStudentService {

     List<Student> getAllStudents();

     Student createNewStudent(Student student);

     void deleteStudent(Integer Id) throws Exception;
}
