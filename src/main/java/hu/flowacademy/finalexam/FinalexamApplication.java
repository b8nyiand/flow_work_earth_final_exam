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

   /* @Bean
    public CommandLineRunner runner() {
        return args -> {
            if (employeeRepository.findAll().isEmpty()) {
                Employee employee1 = new Employee("tesztanna", "Teszt Anna", "management", 1, 800000L, LocalDate.now());
                Employee employee2 = new Employee("tesztpeter", "Teszt Péter", "trade", 2, 500000L, LocalDate.now());

                employeeRepository.save(employee1);
                employeeRepository.save(employee2);
            }
        };
    }*/


}

