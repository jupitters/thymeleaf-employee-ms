package com.jupitters.employee_management_system.service.impl;

import com.jupitters.employee_management_system.model.Employee;
import com.jupitters.employee_management_system.repository.EmployeeRepository;
import com.jupitters.employee_management_system.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll()     ;
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }


}
