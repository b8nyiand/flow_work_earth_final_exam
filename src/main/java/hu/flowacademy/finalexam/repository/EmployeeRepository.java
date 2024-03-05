package hu.flowacademy.finalexam.repository;

import hu.flowacademy.finalexam.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, String > {

    public List<Employee> findByFullName(String fullName);

    public List<Employee> findByUsername(String username);

    public List<Employee> findBySalary(int salary);


}
