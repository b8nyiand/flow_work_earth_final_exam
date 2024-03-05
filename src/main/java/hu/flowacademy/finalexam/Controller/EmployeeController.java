package hu.flowacademy.finalexam.Controller;

import hu.flowacademy.finalexam.Model.Employee;
import hu.flowacademy.finalexam.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return service.createEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return service.getEmployeeById(id).orElseThrow(() -> new RuntimeException("Employee not found : " + id));
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }



    @GetMapping("/salary/{salary}")
    public List<Employee> getEmployeesWithSalaryGreaterThan(@PathVariable Long salary) {
        return service.getEmployeesWithSalaryGreaterThan(salary);
    }



    @GetMapping("/fullname/{name}")
    public List<Employee> getEmployeesWithName(@PathVariable String name) {
        return service.getEmployeesWithNameContains(name);
    }
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee newEmployeeData) {
        return service.updateEmployee(id, newEmployeeData);
    }

}