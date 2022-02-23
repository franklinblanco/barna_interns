package com.blancoinfante.barna_interns.controller;

import com.blancoinfante.barna_interns.domain_obj.Internship;
import com.blancoinfante.barna_interns.service.InternshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InternshipController {
    @Autowired
    InternshipService internshipService;
    @GetMapping("/internships")
    public ResponseEntity<List<Internship>> getInternships(){
        return internshipService.getInternships();
    }
    @GetMapping("/internship/{id}")
    public ResponseEntity<Internship> getInternship(@PathVariable int id){
        return internshipService.getInternship(id);
    }
}
