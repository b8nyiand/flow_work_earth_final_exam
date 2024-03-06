package hu.flowacademy.finalexam.controller;

import hu.flowacademy.finalexam.model.Employee;
import hu.flowacademy.finalexam.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    EmployeeService employeeService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/updateUser/{userName}")
    @ResponseStatus(HttpStatus.OK)
    public Employee upDate(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }


    @DeleteMapping("/delete/{userName}")
    public void deleteEmployee(@PathVariable String userName) {
        employeeService.deleteEmployee(userName);
    }




}
