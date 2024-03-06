package hu.flowacademy.finalexam;

import hu.flowacademy.finalexam.model.Employee;
import hu.flowacademy.finalexam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class FinalexamApplication {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(FinalexamApplication.class, args);
	}

	public CommandLineRunner runner() {
		if (
				employeeRepository.findAll().isEmpty()
		) {
			Employee employee = new Employee("Kovács Lajos", "sales", 1, 570000L, LocalDate.now());

			employeeRepository.save(employee);
		}
	}

}
