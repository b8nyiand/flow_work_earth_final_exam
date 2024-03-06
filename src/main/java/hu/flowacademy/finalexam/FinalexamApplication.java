package hu.flowacademy.finalexam;

import hu.flowacademy.finalexam.modell.Employee;
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
	private EmployeeRepository employeeRepository;
	@Bean
	public CommandLineRunner runner() {
		return args -> {
			if (employeeRepository.findAll().isEmpty()) {
				Employee user1 = new Employee("bcs89","Berkes Csaba", "IT", 1, 500000L, LocalDate.now());
				Employee user2 = new Employee("fcs92","Farkas Csilla", "HR", 2, 300000L, LocalDate.now());
				Employee user3 = new Employee("mp4","Molnár Pista", "CEO", 4, 1500000L, LocalDate.now());
				employeeRepository.save(user1);
				employeeRepository.save(user2);
				employeeRepository.save(user3);


			}
		};
	}
}
