package org.example.hikaricp.repo.imp;

import org.example.hikaricp.model.Employee;
import org.example.hikaricp.repo.EmployeeRepo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepoImp implements EmployeeRepo {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createEmployee(Employee employee) {

    }

    @Override
    public Employee fetchEmployeeById(Integer employeeId) {
        return null;
    }

    @Override
    public List<Employee> fetchAllEmployees() {
        return null;
    }

    @Override
    public void updateEmployeeEmailById(String newEmail, Integer employeeId) {

    }

    @Override
    public void deleteEmployeeById(Integer employeeId) {

    }
}
