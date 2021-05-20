package io.beaniejoy.bootapiserver.controller;

import io.beaniejoy.bootapiserver.mapper.EmployeeMapper;
import io.beaniejoy.bootapiserver.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeMapper employeeMapper;

    public EmployeeController(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @PostMapping("")
    public Employee post(@RequestBody Employee employee) {
        employeeMapper.insert(employee);
        return employee;
    }

    @GetMapping("")
    public List<Employee> getAll() {
        return employeeMapper.getAll();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable("id") Long id) {
        return employeeMapper.getById(id);
    }
}
