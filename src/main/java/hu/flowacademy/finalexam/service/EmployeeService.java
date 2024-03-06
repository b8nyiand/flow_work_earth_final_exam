package hu.flowacademy.finalexam.service;

import hu.flowacademy.finalexam.model.Employee;
import hu.flowacademy.finalexam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(String userName) {
        employeeRepository.deleteById(userName);
    }
    public List<Employee> findByFullName(String fullName) {
        return employeeRepository.findByFullName(fullName);
    }
    public List<Employee> findByUserName(String userName) {
        return employeeRepository.findByUserName(userName);
    }
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }
    public List<Employee> findBySalaryGreaterThan(Long salary) {
        return employeeRepository.findBySalaryGreaterThan(salary);
    }
    public List<Employee> findByFullNameLikeMolnar() {
        return employeeRepository.findByFullNameLike("%Molnár%");
    }

}