package hu.flowacademy.finalexam.repository;

import hu.flowacademy.finalexam.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
    Employee findByUserName(String userName);
    Employee findByFullName(String fullName);
    List<Employee> findBySalaryGreaterThan(Long balance);

}
