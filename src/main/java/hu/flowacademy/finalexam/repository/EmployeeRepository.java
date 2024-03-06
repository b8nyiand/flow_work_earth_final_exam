package hu.flowacademy.finalexam.repository;

import hu.flowacademy.finalexam.model.Employee;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {
}
