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

    public List<Employee> employeeList(String username){
        return employeeRepository.findUsername(username);
    }

}
