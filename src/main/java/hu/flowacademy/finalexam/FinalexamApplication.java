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

	public static void main(String[] args) {
		SpringApplication.run(FinalexamApplication.class, args);
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Bean
	public CommandLineRunner runner() {
		return args -> {
			if (employeeRepository.findAll().isEmpty()) {
				Employee employee1 = new Employee("kovacspisti94", "Kovács István", "HR", 3, 450000L, LocalDate.now());
				Employee employee2 = new Employee("szabomarci55", "Szabó Márton", "IT", 4, 850000L, LocalDate.now());
				Employee employee3 = new Employee("takacseszti11", "Takács Eszter", "HR", 5, 800000L, LocalDate.now());

				employeeRepository.save(employee1);
				employeeRepository.save(employee2);
				employeeRepository.save(employee3);
			}
		};
	}

}
