package hu.flowacademy.finalexam.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Employee {

    @Id
    private String userName;
    private String fullName;
    private String department;
    private Integer jobGrade;
    private Long salary;
    private LocalDate creationDate;

    public Employee(String userName, String fullName, String department, Integer jobGrade, Long salary, LocalDate creationDate) {
        this.userName = userName;
        this.fullName = fullName;
        this.department = department;
        this.jobGrade = jobGrade;
        this.salary = salary;
        this.creationDate = creationDate;
    }

    public Employee() {
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

    public Integer getJobGrade() {
        return jobGrade;
    }

    public void setJobGrade(Integer jobGrade) {
        this.jobGrade = jobGrade;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department='" + department + '\'' +
                ", jobGrade=" + jobGrade +
                ", salary=" + salary +
                ", creationDate=" + creationDate +
                '}';
    }
}
