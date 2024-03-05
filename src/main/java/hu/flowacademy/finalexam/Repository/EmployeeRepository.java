package hu.flowacademy.finalexam.Repository;

import hu.flowacademy.finalexam.Model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Employee findByUsername(String username);
    Employee findByFullName(String fullName);
    List<Employee> findAll();
    List<Employee> findBySalaryGreaterThan(Long salary);
    List<Employee> findByFullNameContains(String name);
}
