package com.firstassignment.dockerproject.service;

import com.firstassignment.dockerproject.model.Student;
import com.firstassignment.dockerproject.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentService implements IStudentService{

    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student createNewStudent(Student student){
        return studentRepo.save(student);
    }

    @Override
    public void deleteStudent(Integer id) throws Exception {
        Optional<Student> newStudent = studentRepo.findById(id);
        if(newStudent.isEmpty())
            throw new Exception();
        studentRepo.delete(newStudent.get());

    }
}
