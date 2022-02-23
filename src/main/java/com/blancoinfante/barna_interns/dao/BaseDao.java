package com.blancoinfante.barna_interns.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.Properties;

public class BaseDao {
    @Autowired
    protected NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    @Qualifier("internshipQueries")
    protected Properties internshipQueries;

    @Autowired
    @Qualifier("companyQueries")
    protected Properties companyQueries;

    @Autowired
    @Qualifier("studentQueries")
    protected Properties studentQueries;
}
