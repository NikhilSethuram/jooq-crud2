package com.example.jooqcrud.Repository;

import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Employee;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {
    @Autowired
    private DSLContext dslContext;


    public void insert(Employee employee) {
        dslContext.insertInto(Tables.EMPLOYEE, Tables.EMPLOYEE.ID, Tables.EMPLOYEE.NAME)
                .values(employee.getId(), employee.getName())
                .execute();
    }

    public List<Employee> getEmployees() {
        return dslContext.selectFrom(Tables.EMPLOYEE).fetchInto(Employee.class);
    }

    public Employee getByID(int ID) {
        List<Employee> list1= dslContext.select().from(Tables.EMPLOYEE).where(Tables.EMPLOYEE.ID.equal(ID))
                .fetchInto(Employee.class);
        System.out.println(list1);
        return list1.get(0);
    }

    public boolean deleteEmployee(int toFindID) {
        return dslContext.deleteFrom(Tables.EMPLOYEE).where(Tables.EMPLOYEE.ID.equal(toFindID)).execute() >= 1;
    }

    public String updateEmployee(int ID, Employee employee) {
        Employee newEmployee = getByID(ID);
        if (newEmployee == null) {
            return "fail";
        } else {
            deleteEmployee(ID);
            insert(employee);
            return "Employee updated";
        }
    }



}
