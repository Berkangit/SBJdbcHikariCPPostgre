package org.example.hikaricp;

import org.example.hikaricp.model.Employee;
import org.example.hikaricp.repo.EmployeeRepo;
import org.example.hikaricp.repo.imp.EmployeeRepoImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HikaricpApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(HikaricpApplication.class, args);

		EmployeeRepo employeeRepo = applicationContext.getBean(EmployeeRepoImp.class);

		Employee employee = employeeRepo.fetchEmployeeById(2);
		System.out.println(employee);
		System.out.println("________________________________________");

		employeeRepo.fetchAllEmployees().forEach(System.out::println);


	}

}
