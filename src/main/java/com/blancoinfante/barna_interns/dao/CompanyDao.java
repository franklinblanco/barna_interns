package com.blancoinfante.barna_interns.dao;

import com.blancoinfante.barna_interns.domain_obj.Company;
import com.blancoinfante.barna_interns.domain_obj.Internship;
import com.blancoinfante.barna_interns.utils.mapper.CompanyMapper;
import com.blancoinfante.barna_interns.utils.mapper.InternshipMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyDao extends BaseDao{
    public Company getCompany(int id){
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", id);
        List<Company> companyResultList = new ArrayList<>();
        try{
            companyResultList = namedParameterJdbcTemplate.query(companyQueries.getProperty("getCompany"), param, new CompanyMapper());
        } catch (Exception e){
            System.out.println(e.toString());
        }
        if(companyResultList.isEmpty()){ return null; }
        return companyResultList.get(0);
    }
    public List<Company> getCompanies(){
        SqlParameterSource param = new MapSqlParameterSource();
        List<Company> companyResultList = new ArrayList<>();
        try{
            companyResultList = namedParameterJdbcTemplate.query(companyQueries.getProperty("getCompanies"), param, new CompanyMapper());
        } catch (Exception e){
            System.out.println(e.toString());
        }
        if(companyResultList.isEmpty()){ return null; }
        return companyResultList;
    }
    public void insertCompany(Company company){
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", company.getId())
                .addValue("rnc", company.getRnc())
                .addValue("legal_name", company.getLegal_name())
                .addValue("date_created", company.getDate_created());
        try{
            namedParameterJdbcTemplate.update(companyQueries.getProperty("insertCompany"), param, holder);
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
