package com.example.jooqcrud.service;

import com.example.jooqcrud.Model.EmployeeModel;

import java.util.List;

public interface EmployeeServiceInterface {
    public void insertEmployee(EmployeeModel employee);

    public List<EmployeeModel> getAllEmployees();

    public EmployeeModel getEmployeeByID(int ID);

    public String deleteEmployee(int ID);

    public String  updateEmployee(int ID,EmployeeModel employee);

}
