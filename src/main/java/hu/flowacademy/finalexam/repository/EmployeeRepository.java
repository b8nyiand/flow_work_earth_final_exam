package hu.flowacademy.finalexam.repository;

import hu.flowacademy.finalexam.model.Employee;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

    Employee findByUsername(String username);

    List<Employee> findByFullNameLike(String fullName);

    List<Employee> findBySalaryGreaterThan(int salary);

    void deleteByUsername(String username);
}
