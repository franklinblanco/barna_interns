package com.blancoinfante.barna_interns.utils.mapper;

import com.blancoinfante.barna_interns.domain_obj.Company;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CompanyMapper implements RowMapper<Company> {

    @Override
    public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
        Company company = new Company();
        company.setId(rs.getInt("id"));
        company.setRnc(rs.getInt("rnc"));
        company.setLegal_name(rs.getString("legal_name"));
        company.setDate_created(rs.getLong("date_created"));
        return company;
    }
}
