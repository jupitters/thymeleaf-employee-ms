package com.jupitters.employee_management_system.service;

import com.jupitters.employee_management_system.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
}
