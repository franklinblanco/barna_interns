package com.blancoinfante.barna_interns.utils.mapper;

import com.blancoinfante.barna_interns.domain_obj.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setDate_of_birth(rs.getLong("date_of_birth"));
        student.setInstitutional_id(rs.getString("institutional_id"));
        student.setDate_created(rs.getLong("date_created"));
        return student;
    }
}
