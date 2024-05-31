package org.example.hikaricp.repo;

import org.example.hikaricp.model.Employee;

import java.util.List;

public interface EmployeeRepo {
    void createEmployee(Employee employee);
    Employee fetchEmployeeById(Integer employeeId);
    List<Employee> fetchAllEmployees();
    //Buna bir tekrar bak
    void updateEmployeeEmailById(String newEmail,Integer employeeId);
    void deleteEmployeeById(Integer employeeId);
}
