package hu.flowacademy.finalexam.controller;

import hu.flowacademy.finalexam.entity.Employee;
import hu.flowacademy.finalexam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    @RequestMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee registerEmployee(@RequestBody Employee employee){
        return employeeService.add(employee);
    }


    @PostMapping
    @RequestMapping("/modify")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Employee modifyEmployee(@RequestBody Employee employee){
        return employeeService.add(employee);
    }

    @DeleteMapping
    @RequestMapping("/delete/{userName}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable String userName){
        employeeService.delete(userName);
    }

    @GetMapping
    @RequestMapping("/find/{userName}")
    public Optional<Employee> findByUserName(@PathVariable String userName){
        return employeeService.findByUserName(userName);
    }

    @GetMapping
    @RequestMapping("/find-by-fullName/{fullName}")
    public List<Employee> findByFullName(@PathVariable String fullName){
        return employeeService.findByFullName(fullName);
    }


    //FIXME: 200-al visszajön, de nem mutatja az emlpoyee-kat
    @GetMapping
    @RequestMapping("/find-by-like/{name}")
    public List<Employee> findByLike(String name){
        return employeeService.findByLike(name);
    }

}
