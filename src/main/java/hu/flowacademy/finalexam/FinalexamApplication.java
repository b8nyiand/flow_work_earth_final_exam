package hu.flowacademy.finalexam;

import hu.flowacademy.finalexam.Model.Employee;
import hu.flowacademy.finalexam.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class FinalexamApplication {

	@Autowired
	private EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(FinalexamApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase() {
		return args -> {
			if (repository.count() == 0) {
				Employee employee1 = new Employee();
				employee1.setUsername("username1");
				employee1.setFullName("fullName1");
				employee1.setDepartment("department1");
				employee1.setJobGrade(1);
				employee1.setSalary(50000L);
				employee1.setCreationDate(LocalDate.now());
				repository.save(employee1);

				Employee employee2 = new Employee();
				employee2.setUsername("username2");
				employee2.setFullName("fullName2");
				employee2.setDepartment("department2");
				employee2.setJobGrade(2);
				employee2.setSalary(60000L);
				employee2.setCreationDate(LocalDate.now());
				repository.save(employee2);
			}
		};
	}
}
