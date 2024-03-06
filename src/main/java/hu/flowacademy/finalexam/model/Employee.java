package hu.flowacademy.finalexam.model;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name = "the_employee")
public class Employee {
    @Id
    private String userName;
    private Integer jobgrade;
    private String fullName;
    private String department;
    private Long salary;
    private LocalDate creationDate;

    public Employee() {
    }

    public Employee(String userName, Integer jobgrade, String fullName, String department, Long salary, LocalDate creationDate) {
        this.userName = userName;
        this.jobgrade = jobgrade;
        this.fullName = fullName;
        this.salary = salary;
        this.creationDate = creationDate;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getJobgrade() {
        return jobgrade;
    }

    public void setJobgrade(Integer jobgrade) {
        this.jobgrade = jobgrade;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
