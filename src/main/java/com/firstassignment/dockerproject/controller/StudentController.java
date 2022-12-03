package com.firstassignment.dockerproject.controller;

import com.firstassignment.dockerproject.model.Student;
import com.firstassignment.dockerproject.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // This means that this class is a Controller
@RequestMapping(path="/university") // This means URL's start with /demo (after Application path)
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(path="/add") // Map ONLY POST Requests
    public ResponseEntity<Object> addNewStudent (@RequestBody Student student) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(student));
    }

    @GetMapping(path="/all")
    public ResponseEntity<Object> getALlStudents() {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(studentService.getAllStudents());
    }

    @DeleteMapping(path="/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer id) throws Exception {
        studentService.deleteStudent(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("The student has been removed successfully!");
    }

}
