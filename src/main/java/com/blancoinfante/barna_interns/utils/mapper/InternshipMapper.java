package com.blancoinfante.barna_interns.utils.mapper;

import com.blancoinfante.barna_interns.domain_obj.Internship;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InternshipMapper implements RowMapper<Internship> {
    @Override
    public Internship mapRow(ResultSet rs, int rowNum) throws SQLException {
        Internship internship = new Internship();
        internship.setId(rs.getInt("id"));
        internship.setName(rs.getString("name"));
        internship.setDescription(rs.getString("description"));
        internship.setSalary(rs.getDouble("salary"));
        internship.setDate_created(rs.getLong("date_created"));
        internship.setCompanyId(rs.getInt("company_id"));
        //Enum worktype
        String worktypestr = rs.getString("work_type");
        internship.setWorkType(Internship.workType.DUAL);
        for (Internship.workType wt:
             Internship.workType.values()) {
            if(worktypestr.equals(wt.name())){
                internship.setWorkType(Internship.workType.valueOf(wt.name()));
            }
        }
        internship.setDuration(rs.getInt("duration"));
        internship.setVacancies(rs.getInt("vacancies"));
        return internship;
    }
}
