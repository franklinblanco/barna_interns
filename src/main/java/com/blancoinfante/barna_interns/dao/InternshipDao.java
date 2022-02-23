package com.blancoinfante.barna_interns.dao;

import com.blancoinfante.barna_interns.domain_obj.Internship;
import com.blancoinfante.barna_interns.domain_obj.Student;
import com.blancoinfante.barna_interns.utils.mapper.InternshipMapper;
import com.blancoinfante.barna_interns.utils.mapper.StudentMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InternshipDao extends BaseDao{
    public Internship getInternship(int id){
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", id);
        List<Internship> internshipResultList = new ArrayList<>();
        try{
            internshipResultList = namedParameterJdbcTemplate.query(internshipQueries.getProperty("getInternship"), param, new InternshipMapper());
        } catch (Exception e){
            System.out.println(e.toString());
        }
        if(internshipResultList.isEmpty()){ return null; }
        return internshipResultList.get(0);
    }
    public List<Internship> getInternships(){
        SqlParameterSource param = new MapSqlParameterSource();
        List<Internship> internshipResultList = new ArrayList<>();
        try{
            internshipResultList = namedParameterJdbcTemplate.query(internshipQueries.getProperty("getInternships"), param, new InternshipMapper());
        } catch (Exception e){
            System.out.println(e.toString());
        }
        if(internshipResultList.isEmpty()){ return null; }
        return internshipResultList;
    }/*
    public void insertInternship(Internship internship) {
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", Internship.getId())
                .addValue("name", Internship.getName())
                .addValue("date_of_birth", Internship.getDate_of_birth())
                .addValue("institutional_id", Internship.getInstitutional_id())
                .addValue("date_created", Internship.getDate_created());
        int rowsAffected;
        try{
            rowsAffected = namedParameterJdbcTemplate.update(internshipQueries.getProperty("insertStudent"), param, holder);
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public int getInternshipsCount(){
        SqlParameterSource param = new MapSqlParameterSource();
        int studentCount = -1;
        try{
            studentCount = namedParameterJdbcTemplate.queryForObject(internshipQueries.getProperty("getStudentCount"), param, Integer.class);
        } catch (Exception e){
            System.out.println(e.toString());
        }
        return studentCount;
    }*/
}
