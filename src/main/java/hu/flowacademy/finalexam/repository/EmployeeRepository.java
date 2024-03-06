package hu.flowacademy.finalexam.repository;

import hu.flowacademy.finalexam.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

    List<Employee> findByFullNameContaining(String name);

}
