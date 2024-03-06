package hu.flowacademy.finalexam.controller;

import hu.flowacademy.finalexam.model.Employee;
import hu.flowacademy.finalexam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/get-username")
    public List<Employee> userName() {
        return employeeRepository.findByFullNameLike("Molnar%");
    }

    @GetMapping("/above-one-mill")
    public List<Employee> higherThan1Mill(){
        return employeeRepository.findBySalaryGreaterThan(500000);
    }


}
