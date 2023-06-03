package com.example.jooqcrud.service;

import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Employee;

import java.util.List;

public interface EmployeeServiceInterface {
    public void insertEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public List<Employee> getEmployeeByID(int ID);

    public String deleteEmployee(int ID);

    public void updateEmployee(Employee employee);

}
