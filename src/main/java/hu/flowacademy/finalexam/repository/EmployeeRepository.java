package hu.flowacademy.finalexam.repository;

import hu.flowacademy.finalexam.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
    public List<Employee> findUserName(String username);

    public List<Employee> findAllEmployee(String username);


}


