package com;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Employee e) {
        String sql = "INSERT INTO employee(name, salary) VALUES (?, ?)";
        jdbcTemplate.update(sql, e.getName(), e.getSalary());
    }

    @Override
    public List<Employee> findAll() {
        return jdbcTemplate.query("SELECT * FROM employee", new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setSalary(rs.getDouble("salary"));
                return e;
            }
        });
    }
}