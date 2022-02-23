package com.blancoinfante.barna_interns.service;

import com.blancoinfante.barna_interns.dao.StudentDao;
import com.blancoinfante.barna_interns.domain_obj.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public ResponseEntity<Student> getStudent(int id){
        return new ResponseEntity<>(studentDao.getStudent(id), HttpStatus.OK);
    }
    public ResponseEntity<List<Student>> getStudents(){
        return new ResponseEntity<>(studentDao.getStudents(), HttpStatus.OK);
    }
    public ResponseEntity<Student> createStudent(Student student){
        student.setId(studentDao.getStudentsCount());
        Date date = new Date();
        student.setDate_created(date.getTime());
        studentDao.insertStudent(student);
        return new ResponseEntity<>(studentDao.getStudent(student.getId()), HttpStatus.OK);
    }
    public void validateStudent(){}
}
