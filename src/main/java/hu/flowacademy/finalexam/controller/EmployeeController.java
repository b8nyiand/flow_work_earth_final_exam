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
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/delete/{userName}")
    public void deleteEmployee(@PathVariable String userName) {
        employeeService.deleteEmployee(userName);
    }

    @GetMapping("/findByFullName/{fullName}")
    public List<Employee> findByFullName(@PathVariable String fullName) {
        return employeeService.findByFullName(fullName);
    }

    @GetMapping("/findByUserName/{userName}")
    public List<Employee> findByUserName(@PathVariable String userName) {
        return employeeService.findByUserName(userName);
    }
    @GetMapping("/findAllEmployees")
    public List<Employee> findAllEmployees() {
        return employeeService.findAllEmployees();
    }

    @GetMapping("/findBySalaryGreaterThan/{salary}")
    public List<Employee> findBySalaryGreaterThan(@PathVariable Long salary) {
        return employeeService.findBySalaryGreaterThan(salary);
    }

    @GetMapping("/findByFullNameLikeMolnar")
    public List<Employee> findByFullNameLikeMolnar() {
        return employeeService.findByFullNameLikeMolnar();
    }

}
