package hu.flowacademy.finalexam.service;

import hu.flowacademy.finalexam.model.Employee;
import hu.flowacademy.finalexam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getUserByName(String name) {
        return employeeRepository.findByUsername(name);
    }

    public List<Employee> getAllUser() {
        return employeeRepository.findAll();
    }

    public Employee addUser(Employee user) {
        return employeeRepository.save(user);
    }

    @Transactional
    public void deleteUserByName(String userName) {
        employeeRepository.deleteByUsername(userName);
    }

    @Transactional
    public Employee updateUser(Employee employee) {
        return employeeRepository.save(employee);
    }
}
