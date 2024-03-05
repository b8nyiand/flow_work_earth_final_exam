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

    public Employee addEmployee(Employee employee) {
        employee.setCreationDate(LocalDate.now());
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        employee.setCreationDate(LocalDate.now());
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }

    public List<Employee> getEmployeeByFullName(String fullName) {
        return employeeRepository.findByFullName(fullName);
    }

    public List<Employee> getEmployeeByUsername(String username) {
        return employeeRepository.findByUsername(username);
    }

    public List<Employee> listEmployees() {
        return employeeRepository.findAll();
    }

    public List<Employee> getSalary(int salary) {
        return employeeRepository.findBySalary(salary);
    }


}
