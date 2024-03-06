package hu.flowacademy.finalexam.service;

import hu.flowacademy.finalexam.model.Employee;
import hu.flowacademy.finalexam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(String userName) {
        Employee employeeToDelete = employeeRepository.findByUserName(userName);
        if (employeeToDelete != null) {
            employeeRepository.delete(employeeToDelete);
        } else {
            throw new RuntimeException("cannot find employee");
        }
    }

    public Employee getEmployeeByUserName(String userName) {
        return employeeRepository.findByUserName(userName);
    }

    public Employee getEmployeeByFullName(String fullName) {
        return employeeRepository.findByFullName(fullName);
    }

    public List<Employee> listAllEmployees() {
        return employeeRepository.findAll();
    }

    public List<Employee> getEmployeeSalaryGreaterThanAmount(Long amount) {
        return employeeRepository.findBySalaryGreaterThan(amount);
    }
}