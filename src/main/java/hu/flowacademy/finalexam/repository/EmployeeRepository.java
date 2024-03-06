package hu.flowacademy.finalexam.repository;

import hu.flowacademy.finalexam.modell.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

    List<Employee> findByFullNameLike(String fullName);

    List<Employee> findByFullName(String fullName);
    List<Employee> findBySalaryGreaterThan(int salary);
}
