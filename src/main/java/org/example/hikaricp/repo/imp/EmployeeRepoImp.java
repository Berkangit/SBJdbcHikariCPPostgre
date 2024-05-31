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
        String updateSql = "INSERT INTO employee (employee_name, email, gender, employee_salary) VALUES (?, ?, ?, ?)";
        int update = getJdbcTemplate().update(updateSql,employee.getEmployeeName(),employee.getEmail(),employee.getGender(),employee.getSalary());
        if(update != 0)
        {
            System.out.println("Created");
        }
    }

    @Override
    public Employee fetchEmployeeById(Integer employeeId) {
        String fetchSql = "SELECT * FROM employee WHERE employee_id = ?";
        return getJdbcTemplate().queryForObject(fetchSql, new EmployeeRowMapper(), employeeId);

    }

    @Override
    public List<Employee> fetchAllEmployees() {
        String fetchAllSql = "SELECT * FROM employee";
        return getJdbcTemplate().query(fetchAllSql,new EmployeeRowMapper());
    }

    @Override
    public void updateEmployeeEmailById(String newEmail, Integer employeeId) {
        String updateSqlById = "UPDATE employee set email = ? WHERE employee_id = ?";
        int update = getJdbcTemplate().update(updateSqlById,newEmail,employeeId);
        if(update != 0)
        {
            System.out.println("Updated");
        }

    }

    @Override
    public void deleteEmployeeById(Integer employeeId) {
        String SQL = "DELETE FROM employee WHERE employee_id = ?";
        int update = getJdbcTemplate().update(SQL,employeeId);
        if(update != 0) {
            System.out.println("Employee deleted = "+ employeeId);
        }
    }
}
