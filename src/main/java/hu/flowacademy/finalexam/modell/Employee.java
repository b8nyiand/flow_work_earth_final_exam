package hu.flowacademy.finalexam.modell;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Employee {
    @Id
    private String username;
    private String fullName;
    private String department;
    private int jobgrade;
    private Long salary;
    private LocalDate creationDate;

    public Employee() {
    }

    public Employee(String username, String fullName, String department, int jobgrade, Long salary, LocalDate creationDate) {
        this.username = username;
        this.fullName = fullName;
        this.department = department;
        this.jobgrade = jobgrade;
        this.salary = salary;
        this.creationDate = creationDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public int getJobgrade() {
        return jobgrade;
    }

    public void setJobgrade(int jobgrade) {
        this.jobgrade = jobgrade;
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
        return "Emplyee{" +
                "username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department='" + department + '\'' +
                ", jobgrade=" + jobgrade +
                ", salary=" + salary +
                ", creationDate=" + creationDate +
                '}';
    }
}
