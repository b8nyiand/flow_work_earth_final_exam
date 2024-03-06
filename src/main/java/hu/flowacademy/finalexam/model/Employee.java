package hu.flowacademy.finalexam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    @Id
    private String username;
    private String fullName;
    private String department;
    private Integer jobgrade;
    private Long salary;
    private LocalDate creationDate;


    public Employee(String username, String fullName, String department, Integer jobgrade, Long salary) {
        this.username = username;
        this.fullName = fullName;
        this.department = department;
        this.jobgrade = jobgrade;
        this.salary = salary;
    }
}
