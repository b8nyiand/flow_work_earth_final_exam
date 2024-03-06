package hu.flowacademy.finalexam.service;

import hu.flowacademy.finalexam.modell.Employee;
import hu.flowacademy.finalexam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    //    public List<Employee> findByFullnameLike(){
//        return EmployeeRepository.findByFullnameLike("%Molnar%");
//
//    }
    public Employee addUser(Employee users) {
        return employeeRepository.save(users);
    }
    public Employee updateUser(Employee employee){
        return employeeRepository.save(employee);
    }
    public void deleteUser(Employee username){
        employeeRepository.delete(username);
    }
    public List<Employee> usersList(){
        return employeeRepository.findAll();
    }
    public List<Employee> findByFullname(String fullName){
        return employeeRepository.findByFullName(fullName);
    }
    public List<Employee> findByFullnameLike(){
        return employeeRepository.findByFullNameLike("%Molnar%");
    }
    public List<Employee> findByAnySalaryGreaterThan(int salary) {
        return employeeRepository.findBySalaryGreaterThan(salary);
    }
}
