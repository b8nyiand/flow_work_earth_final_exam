package hu.flowacademy.finalexam.service;

import hu.flowacademy.finalexam.model.Employee;
import hu.flowacademy.finalexam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addNewEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteByUsername(String userName) {
        Optional<Employee> ownerToDelete = employeeRepository.findById(userName);
        if (ownerToDelete.isPresent())
            employeeRepository.deleteById(userName);
        else {
            System.out.println("No username like this");
        }
    }

    public List<Employee> findByFullName(String fullName) {
        List<Employee> employeeList = employeeRepository.findByFullName(fullName);
        if (employeeList != null && !employeeList.isEmpty()) {
            return employeeList;
        } else {
            System.out.println("No employee with this name");
            return null;
        }
    }

    public List<Employee> findById(String username) {
        Optional<Employee> employeeList = employeeRepository.findById(username);
        if (employeeList != null && !employeeList.isEmpty()) {
            return Collections.singletonList(employeeList.orElse(null));
        } else {
            System.out.println("No employee with this username");
            return null;
        }
    }

    public List<Employee> salaryIsBigger(Long salary) {
        return employeeRepository.findAll().
                stream().
                filter(x -> x.getSalary() > salary).
                collect(Collectors.toList());

    }


}
