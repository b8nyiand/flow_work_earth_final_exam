package hu.flowacademy.finalexam.controller;

import hu.flowacademy.finalexam.model.Employee;
import hu.flowacademy.finalexam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/delete/{userName}")
    public void deleteEmployee(@PathVariable String userName) {
        employeeService.deleteEmployee(userName);
    }

    @GetMapping("/{userName}")
    public Employee getEmployeeByUserName(@PathVariable String userName) {
        return employeeService.getEmployeeByUserName(userName);
    }

    @GetMapping("/{fullName}")
    public Employee getEmployeeByFullName(@PathVariable String fullName) {
        return employeeService.getEmployeeByFullName(fullName);
    }

    @GetMapping("/list")
    public List<Employee> listAllEmployees() {
        return employeeService.listAllEmployees();
    }

    @GetMapping("/salary-greater-than/{amount}")
    public List<Employee> getEmployeesSalaryGreaterThan(@PathVariable Long amount) {
        return employeeService.getEmployeeSalaryGreaterThanAmount(amount);
    }
}
