package com.blancoinfante.barna_interns.controller;

import com.blancoinfante.barna_interns.domain_obj.Company;
import com.blancoinfante.barna_interns.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @GetMapping("/companies")
    public ResponseEntity<List<Company>> getCompanies(){
        return companyService.getCompanies();
    }
    @GetMapping("/company/{id}")
    public ResponseEntity<Company> getCompanies(@PathVariable int id){
        return companyService.getCompany(id);
    }
    @PostMapping("/company")
    public ResponseEntity<Void> createCompany(@RequestBody Company company){
        return companyService.createCompany(company);
    }
}
