package com.example.jooqcrud.service;

import com.example.jooqcrud.Repository.EmployeeRepository;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceInterface {
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public void insertEmployee(Employee employee) {
        employeeRepository.insert(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getEmployees();
    }

    @Override
    public Employee getEmployeeByID(int ID) {
        return employeeRepository.getByID(ID);
    }

    @Override
    public String deleteEmployee(int ID) {
        employeeRepository.deleteEmployee(ID);
        return "Book Deleted";
    }

    @Override
    public String updateEmployee(int ID,Employee employee) {
        employeeRepository.updateEmployee(ID,employee);
        return "Employee updated";
    }
}