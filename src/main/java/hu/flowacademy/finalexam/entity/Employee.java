package hu.flowacademy.finalexam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Employee {

    @Id
    @Column(name = "user_name", unique = true)
    private String userName;

    @NotBlank
    String fullName;
    @NotBlank
    String department;
    @NotNull
    Integer jobGrade;
    @NotNull
    Long salary;

    LocalDate creationDate;

    public Employee(String userName,
                    String fullName,
                    String department,
                    Integer jobGrade,
                    Long salary,
                    LocalDate creationDate) {
        this.userName = userName;
        this.fullName = fullName;
        this.department = department;
        this.jobGrade = jobGrade;
        this.salary = salary;
        this.creationDate = creationDate;
    }
}
