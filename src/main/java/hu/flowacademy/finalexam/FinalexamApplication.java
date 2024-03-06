package hu.flowacademy.finalexam;

import hu.flowacademy.finalexam.model.Employee;
import hu.flowacademy.finalexam.repository.EmployeeRepository;
import hu.flowacademy.finalexam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FinalexamApplication {


    public static void main(String[] args) {
        SpringApplication.run(FinalexamApplication.class, args);
    }

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    EmployeeService employeeService;


    @Bean
    CommandLineRunner runner() {
        return args -> {
            if (employeeRepository.findAll().isEmpty()) {
                employeeRepository.save(new Employee("belus", "Kovács Béla", "Marketing", 1, 200220L));
                employeeRepository.save(new Employee("jocos", "Kovács József", "HR", 2, 400220L));
                employeeRepository.save(new Employee("molnar01", "Molnár Béla", "IT", 3, 800220L));
                employeeRepository.save(new Employee("molnarka", "Molnár Áron", "Marketing", 4, 600220L));
            }
            System.out.println("Ready");
        };
    }

}
