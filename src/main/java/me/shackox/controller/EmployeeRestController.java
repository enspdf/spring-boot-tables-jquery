package me.shackox.controller;

import me.shackox.model.Employee;
import me.shackox.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by SHACKOX on 20/12/16.
 */

@RestController
public class EmployeeRestController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(path = "/employees", method = RequestMethod.GET)
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @RequestMapping(path = "/employee/{id}", method = RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable("id") long id) {
        return employeeService.getEmployeeById(id);
    }
}
