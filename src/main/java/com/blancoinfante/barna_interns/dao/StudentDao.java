package com.blancoinfante.barna_interns.dao;

import com.blancoinfante.barna_interns.domain_obj.Student;
import com.blancoinfante.barna_interns.utils.mapper.StudentMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDao extends BaseDao{
    public Student getStudent(int id){
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", id);
        List<Student> studentResultList = new ArrayList<>();
        try{
            studentResultList = namedParameterJdbcTemplate.query(studentQueries.getProperty("getStudent"), param, new StudentMapper());
        } catch (Exception e){
            System.out.println(e.toString());
        }
        if(studentResultList.isEmpty()){ return null; }
        return studentResultList.get(0);
    }
    public List<Student> getStudents(){
        SqlParameterSource param = new MapSqlParameterSource();
        List<Student> studentResultList = new ArrayList<>();
        try{
            studentResultList = namedParameterJdbcTemplate.query(studentQueries.getProperty("getStudents"), param, new StudentMapper());
        } catch (Exception e){
            System.out.println(e.toString());
        }
        if(studentResultList.isEmpty()){ return null; }
        return studentResultList;
    }
    public void insertStudent(Student student) {
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", student.getId())
                .addValue("name", student.getName())
                .addValue("date_of_birth", student.getDate_of_birth())
                .addValue("institutional_id", student.getInstitutional_id())
                .addValue("date_created", student.getDate_created());
        int rowsAffected;
        try{
            rowsAffected = namedParameterJdbcTemplate.update(studentQueries.getProperty("insertStudent"), param, holder);
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public int getStudentsCount(){
        SqlParameterSource param = new MapSqlParameterSource();
        int studentCount = -1;
        try{
            studentCount = namedParameterJdbcTemplate.queryForObject(studentQueries.getProperty("getStudentCount"), param, Integer.class);
        } catch (Exception e){
            System.out.println(e.toString());
        }
        return studentCount;
    }
}
