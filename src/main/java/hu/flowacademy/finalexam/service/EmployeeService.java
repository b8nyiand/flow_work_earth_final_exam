package hu.flowacademy.finalexam.service;

import hu.flowacademy.finalexam.entity.Employee;
import hu.flowacademy.finalexam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee add(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee modify(Employee employee){
        return employeeRepository.save(employee);
    }

    public void delete(String userName){
        employeeRepository.deleteById(userName);
    }

    public Optional<Employee> findByUserName(String userName){
        return employeeRepository.findById(userName);
    }

    public List<Employee> findByFullName(String fullName){
        return employeeRepository.findByFullNameContaining(fullName);
    }
}
