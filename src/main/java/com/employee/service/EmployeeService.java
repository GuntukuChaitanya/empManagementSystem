package com.employee.service;

import com.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.entity.Employee;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public Employee saveEmployee(Employee employee){
        return repo.save(employee);
    }

    public List<Employee> saveEmployees(List<Employee> employees){
        return repo.saveAll(employees);
    }

    public List<Employee> getAllEmployees(){
        return repo.findAll();
    }
}
