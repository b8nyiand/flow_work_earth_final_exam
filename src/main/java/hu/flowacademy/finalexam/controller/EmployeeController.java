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
    public EmployeeService employeeService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addNewEmployee(@RequestBody Employee employee) {
        return employeeService.addNewEmployee(employee);
    }

    @PutMapping("/update")
    public Employee updateAccountOwner(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }


    @DeleteMapping("/deleteByUserName/{userName}")
    public void deleteEmployeeByUsername(@PathVariable String userName) {
        employeeService.deleteByUsername(userName);

    }

    @GetMapping("/findByFullName/{fullName}")
    public List<Employee> findByFullName(@PathVariable String fullName) {
        return employeeService.findByFullName(fullName);
    }
    @GetMapping("/findById/{username}")
            public List<Employee>findById(@PathVariable String username){
        return employeeService.findById(username);
    }
    @GetMapping("/biggersalary/{salary}")
    public  List<Employee> salaryIsBigger(@PathVariable Long salary){
        return employeeService.salaryIsBigger(salary);
    }

}
