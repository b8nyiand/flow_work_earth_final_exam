package hu.flowacademy.finalexam;

import hu.flowacademy.finalexam.model.Employee;
import hu.flowacademy.finalexam.model.JobGrade;
import hu.flowacademy.finalexam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class FinalexamApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalexamApplication.class, args);
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Bean
	public CommandLineRunner runner() {
		return args -> {
			if (employeeRepository.findAll().isEmpty()) {
				Employee employee = new Employee("Ákos", "Bakos Ákos", "HR", JobGrade.MEDIOR, 400000L, LocalDateTime.now());
				Employee employee1 = new Employee("Endre", "Bakos Endre", "HR", JobGrade.SENIOR, 100000L, LocalDateTime.now());

			employeeRepository.save(employee);
			employeeRepository.save(employee1);
			}

		};
	}
}