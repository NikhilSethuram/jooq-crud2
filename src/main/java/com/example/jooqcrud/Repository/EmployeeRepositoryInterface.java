package com.example.jooqcrud.Repository;

import com.example.jooqcrud.Model.EmployeeModel;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Employee;

import java.util.List;

public interface EmployeeRepositoryInterface {
    public void insert(EmployeeModel employee);
    public List<Employee> getAll();
    public Employee getByID(int ID);
    public boolean deleteEmployee(int ID);
    public String updateEmployee(int ID,EmployeeModel employee);
}
