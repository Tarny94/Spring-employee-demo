package com.example.securitydemo.service;

import com.example.securitydemo.modal.Employee;
import com.example.securitydemo.modal.User;
import com.example.securitydemo.repository.EmployeeRepository;
import com.example.securitydemo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private String testPassword = "{noop}test123";
    private final EmployeeRepository employeeRepository;

    private final UserRepository userRepository;

    public EmployeeService(EmployeeRepository employeeRepository, UserRepository userRepository) {
        this.employeeRepository = employeeRepository;
        this.userRepository = userRepository;
    }

    public Employee createEmployee(Employee employee) {

        Employee employeeDB = employeeRepository.insert(employee);
        userRepository.insert(new User(employee.getEmail(), testPassword , employeeDB, employee.getAuthority()));
        return employeeDB;
    }

    public Employee editEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployee(String employeeId) {
        return employeeRepository.findById(employeeId);
    }
    public Employee deleteEmployee(String employeeId){
        Optional<Employee> employee = getEmployee(employeeId);
        employeeRepository.deleteById(employeeId);
        return employee.orElse(null);
    }
}
