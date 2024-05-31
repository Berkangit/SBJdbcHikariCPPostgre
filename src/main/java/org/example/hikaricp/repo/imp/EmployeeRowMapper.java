package org.example.hikaricp.repo.imp;

import org.example.hikaricp.model.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setEmployeeId(rs.getInt("employee_id"));
        employee.setEmployeeName(rs.getString("employee_name"));
        employee.setEmail(rs.getString("email"));
        employee.setGender(rs.getString("gender"));
        employee.setSalary(rs.getDouble("employee_salary"));
        return employee;
    }
}
