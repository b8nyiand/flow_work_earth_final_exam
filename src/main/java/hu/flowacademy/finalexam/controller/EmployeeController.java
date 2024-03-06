package hu.flowacademy.finalexam.controller;

import hu.flowacademy.finalexam.model.Employee;
import hu.flowacademy.finalexam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/findAll")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @DeleteMapping("/delete")
    public void delete(Employee employee) {
        employeeService.delete(employee);
    }

    @PostMapping("/save")
    public Employee save(Employee employee) {
        employeeService.save(employee);
        return employee;
    }

    @PutMapping("/update")
    public Employee update(Employee employee) {
        employeeService.save(employee);
        return employee;
    }

    @GetMapping("/findByUsername")
    public Employee findByUsername(String username) {
        return employeeService.findByUsername(username);
    }


}
