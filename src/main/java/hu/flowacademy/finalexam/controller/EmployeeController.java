package hu.flowacademy.finalexam.controller;

import hu.flowacademy.finalexam.model.Employee;
import hu.flowacademy.finalexam.repository.EmployeeRepository;
import hu.flowacademy.finalexam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/get-username")
    public List<Employee> userName() {
        return employeeRepository.findByFullNameLike("Molnar%");
    }

    @GetMapping("/above-one-mill")
    public List<Employee> higherThan1Mill(){
        return employeeRepository.findBySalaryGreaterThan(500000);
    }

    @GetMapping("/find-by-name/{name}")
    public Employee findByName(@PathVariable String name) {
        return employeeService.getUserByName(name);
    }

    @GetMapping("/find-all-users")
    public List<Employee> getAllUsers() {
        return employeeService.getAllUser();
    }

    @PostMapping("/add-user")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addUser(@RequestBody Employee employee) {
        return employeeService.addUser(employee);
    }

    @DeleteMapping("/delete-user/{name}")
    public void deleteUser(@PathVariable String name) {
        employeeService.deleteUserByName(name);

    }

    @PutMapping("/update-user")
    public Employee updateUser(@RequestBody Employee employee) {
        return employeeService.updateUser(employee);
    }

}
