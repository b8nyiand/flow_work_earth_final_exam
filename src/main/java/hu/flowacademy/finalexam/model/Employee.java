package hu.flowacademy.finalexam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Employee {

    @Id
    private String userName;
    private String fullName;
    private String department;
    private JobGrade jobGrade;
    private Long salary;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    public Employee() {
    }

    public Employee(String userName, String fullName, String department, JobGrade jobGrade, Long salary, LocalDateTime creationDate) {
        this.userName = userName;
        this.fullName = fullName;
        this.department = department;
        this.jobGrade = jobGrade;
        this.salary = salary;
        this.creationDate = creationDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public JobGrade getJobGrade() {
        return jobGrade;
    }

    public void setJobGrade(JobGrade jobGrade) {
        this.jobGrade = jobGrade;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
