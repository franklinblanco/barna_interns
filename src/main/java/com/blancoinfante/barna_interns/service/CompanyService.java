package com.blancoinfante.barna_interns.service;

import com.blancoinfante.barna_interns.dao.CompanyDao;
import com.blancoinfante.barna_interns.domain_obj.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    CompanyDao companyDao;
    public ResponseEntity<Company> getCompany(int id){
        return new ResponseEntity<>(companyDao.getCompany(id), HttpStatus.OK);
    }
    public ResponseEntity<List<Company>> getCompanies(){
        return new ResponseEntity<>(companyDao.getCompanies(), HttpStatus.OK);
    }
    public ResponseEntity<Void> createCompany(Company company){
        companyDao.insertCompany(company);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
