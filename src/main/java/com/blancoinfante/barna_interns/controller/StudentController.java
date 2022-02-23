package com.blancoinfante.barna_interns.controller;

import com.blancoinfante.barna_interns.domain_obj.Student;
import com.blancoinfante.barna_interns.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents(){
        return studentService.getStudents();
    }
    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
}
