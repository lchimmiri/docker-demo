package org.learning.controller;

import org.learning.model.Employee;
import org.learning.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/docker")
public class DemoController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/")
    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
}
