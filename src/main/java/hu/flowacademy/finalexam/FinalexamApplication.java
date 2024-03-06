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
    private EmployeeRepository employeeRepository;

    @Bean
    public CommandLineRunner runner() {
        return args -> {
			if(employeeRepository.findAll().isEmpty()){
                Employee employee1 = new Employee("ssimonlara", 3, "Simon Lara", "it", 1000L, LocalDate.now());
                employeeRepository.save(employee1);

                Employee employee2 = new Employee("asd", 1, "asd asd", "it", 10L, LocalDate.now());
                employeeRepository.save(employee2);
			}
        };
    }
}
