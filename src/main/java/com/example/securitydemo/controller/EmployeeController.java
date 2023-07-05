package com.example.securitydemo.controller;

import com.example.securitydemo.modal.Employee;
import com.example.securitydemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
@RestController
public class EmployeeController {

    private final String ENDPOINT = "employees";
    private final EmployeeService service;

    EmployeeController(EmployeeService employeeService) {
        this.service = employeeService;
    }

    @GetMapping(ENDPOINT+"/{employeeId}")
    public Optional<Employee> getEmployee(@PathVariable String employeeId){
      return service.getEmployee(employeeId);
    }

    @GetMapping(ENDPOINT)
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @PostMapping(ENDPOINT)
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.createEmployee(employee);
    }

    @PutMapping(ENDPOINT)
    public Employee editEmployee(@RequestBody Employee employee) {return service.editEmployee(employee);}

    @DeleteMapping(ENDPOINT+"/{employeeId}")
    public Employee deleteEmployee(@PathVariable String employeeId) {
        return service.deleteEmployee(employeeId);
    }

}
