package hu.flowacademy.finalexam.Service;

import hu.flowacademy.finalexam.Model.Employee;
import hu.flowacademy.finalexam.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import java.time.LocalDate;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    @Autowired
    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee createEmployee(Employee employee) {
        employee.setCreationDate(LocalDate.now());
        return repository.save(employee);
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return repository.findById(id);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee updateEmployee(Long id, Employee newEmployeeData) {
        return repository.findById(id)
                .map(employee -> {
                    employee.setUsername(newEmployeeData.getUsername());
                    employee.setFullName(newEmployeeData.getFullName());
                    employee.setDepartment(newEmployeeData.getDepartment());
                    employee.setJobGrade(newEmployeeData.getJobGrade());
                    employee.setSalary(newEmployeeData.getSalary());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployeeData.setId(id);
                    return repository.save(newEmployeeData);
                });
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }

    public List<Employee> getEmployeesWithSalaryGreaterThan(Long salary) {
        return repository.findBySalaryGreaterThan(salary);
    }
    public List<Employee> getEmployeesWithNameContains(String name) {
        return repository.findByFullNameContains(name);
    }
}