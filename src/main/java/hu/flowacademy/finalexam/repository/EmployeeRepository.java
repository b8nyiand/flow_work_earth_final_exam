package hu.flowacademy.finalexam.repository;

import hu.flowacademy.finalexam.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
    List<Employee> findByFullName(String fullName);
    List<Employee> findByUserName(String userName);
    List<Employee> findBySalaryGreaterThan(Long salary);
    List<Employee> findByFullNameLike(String fullName);

}
