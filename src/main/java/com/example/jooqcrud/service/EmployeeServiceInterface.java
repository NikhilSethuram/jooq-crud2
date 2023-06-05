package com.example.jooqcrud.service;

import com.example.jooqcrud.Model.EmployeeModel;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Employee;

import java.util.List;

public interface EmployeeServiceInterface {
    public void insertEmployee(Employee employee);

    public List<EmployeeModel> getAllEmployees();

    public EmployeeModel getEmployeeByID(int ID);

    public String deleteEmployee(int ID);

    public String  updateEmployee(int ID,Employee employee);

}
