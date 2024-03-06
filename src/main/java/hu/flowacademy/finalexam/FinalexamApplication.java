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
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(FinalexamApplication.class, args);
	}


	@Bean
	public CommandLineRunner runner() {
		return args -> {
			if (employeeRepository.findAll().isEmpty()) {
				Employee employee1 = new Employee("Tapsi", "Hapsi Tapsi", "Looney Tunes", 5, 1_233_564l, LocalDate.now());
				employeeRepository.save(employee1);

			}
		};
	}
}
