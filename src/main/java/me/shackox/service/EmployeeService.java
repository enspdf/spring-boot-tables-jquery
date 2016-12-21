package me.shackox.service;

import me.shackox.model.Employee;

import java.util.List;

/**
 * Created by SHACKOX on 20/12/16.
 */
public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(long id);
}
