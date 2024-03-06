package hu.flowacademy.finalexam.controller;

import hu.flowacademy.finalexam.modell.Employee;
import hu.flowacademy.finalexam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    //    @GetMapping("/molnar")
//    public List<Employee> findByFullnameLike(){
//        return employeeService.findByFullnameLike();
//    }
    @PostMapping("/adduser")
    public Employee addUser(@RequestBody Employee employee) {
        return employeeService.addUser(employee);
    }
    @PutMapping("/updateuser")
    public Employee updateUser(@RequestBody Employee employee) {
        return employeeService.updateUser(employee);
    }
    @DeleteMapping("/deleteuser/{username}")
    public void deleteUser(Employee username) {
        employeeService.deleteUser(username);
    }
    @GetMapping("/userlist")
    public List<Employee> listAllUsers(){
        return employeeService.usersList();
    }
    @GetMapping("/findByName/{fullName}")
    public List<Employee> findByFullname(@PathVariable String fullName) {
        return employeeService.findByFullname(fullName);
    }
    @GetMapping("/molnar")
    public List<Employee> findByFullnameLike(){
        return employeeService.findByFullnameLike();
    }
    @GetMapping("/slarygreatherthen/{salary}")
    private List<Employee> findByAnySalaryGreaterThan(@PathVariable int salary) {
        return employeeService.findByAnySalaryGreaterThan(salary);
    }
}
