package com.blancoinfante.barna_interns.service;

import com.blancoinfante.barna_interns.dao.InternshipDao;
import com.blancoinfante.barna_interns.domain_obj.Internship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternshipService {
    @Autowired
    InternshipDao internshipDao;

    //General calls
    public ResponseEntity<List<Internship>> getInternships(){
        return new ResponseEntity<>(internshipDao.getInternships(), HttpStatus.OK);
    }
    public ResponseEntity<Internship> getInternship(int id){
        return new ResponseEntity<>(internshipDao.getInternship(id), HttpStatus.OK);
    }

    //Student calls
    public void applyForInternship(){}

    //Company Calls
    public void createInternship(){}
    public void listInternshipApplications(){}
    public void denyApplication(){}
    public void approveApplication(){}

}
