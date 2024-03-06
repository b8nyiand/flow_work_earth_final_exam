package hu.flowacademy.finalexam.service;

import hu.flowacademy.finalexam.model.Employee;
import hu.flowacademy.finalexam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;

    public Employee save(Employee employee) {
        employee.setCreationDate(LocalDate.now());
        employeeRepository.save(employee);
        return employee;
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }


   public void delete(Employee employee) {
        employeeRepository.delete(employee);
   }


    public Employee findByUsername (String username) {
        return employeeRepository.findByUsername(username);
    }

    public Employee findByFullName(String fullName) {
        return employeeRepository.findByUsername(fullName);
    }

    public List<Employee> findBySalaryMoreThan(Long salary) {
        return employeeRepository.findBySalaryMoreThan(salary);
    }


}
