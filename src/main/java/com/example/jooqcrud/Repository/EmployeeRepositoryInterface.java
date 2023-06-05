package com.example.jooqcrud.Repository;

import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Employee;

import java.util.List;

public interface EmployeeRepositoryInterface {
    public void insert(Employee employee);
    public List<Employee> getAll();
    public Employee getByID(int ID);
    public boolean deleteEmployee(int ID);
    public String updateEmployee(int ID,Employee employee);
}
