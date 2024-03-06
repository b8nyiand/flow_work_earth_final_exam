package hu.flowacademy.finalexam.repository;

import hu.flowacademy.finalexam.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

    Employee findByUsername(String username);

    Employee findByFullName(String fullName);

    @Query("SELECT e FROM Employee e WHERE salary>:salary ")
    List<Employee> findBySalaryMoreThan(@Param("salary") Long salary);

}
