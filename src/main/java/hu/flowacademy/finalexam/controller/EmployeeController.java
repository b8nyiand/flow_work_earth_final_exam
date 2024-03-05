package hu.flowacademy.finalexam.controller;

import hu.flowacademy.finalexam.model.Employee;
import hu.flowacademy.finalexam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/deleteByEmployee/{employee}")
    public void deleteEmployee(@PathVariable Employee employee) {
        employeeService.deleteEmployee(employee);
    }

    @GetMapping("/listByFullname/{fullname}")
    public List<Employee> listEmployeeByFullname(@PathVariable String fullName) {
        return employeeService.getEmployeeByFullName(fullName);
    }

    @GetMapping("/list")
    public List<Employee> listEmployees() {
        return employeeService.listEmployees();
    }

    @GetMapping("/listSalary/{salary}")
    public List<Employee> getSalary(@PathVariable int salary) {
        return employeeService.getSalary(salary);
    }

}
