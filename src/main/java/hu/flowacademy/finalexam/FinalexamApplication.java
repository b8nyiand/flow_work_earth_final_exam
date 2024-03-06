package hu.flowacademy.finalexam;

import hu.flowacademy.finalexam.entity.Employee;
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

	@Bean
	public CommandLineRunner runner (){
		return args -> {
			if(employeeRepository.findAll().isEmpty()){
				Employee employee = new Employee("hablaty", "Hablaty Jenő", "Dep_1", 3, 400000L, LocalDate.of(2024, 2, 3));
				employeeRepository.save(employee);

			}
		};
	}

}
