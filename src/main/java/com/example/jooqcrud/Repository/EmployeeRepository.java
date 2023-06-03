package com.example.jooqcrud.Repository;

import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Book;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Employee;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {
    @Autowired
    private DSLContext dslContext;


    public void insert(Employee employee){
        dslContext.insertInto(Tables.EMPLOYEE,Tables.EMPLOYEE.ID,Tables.EMPLOYEE.NAME)
                .values(employee.getId(), employee.getName())
                .execute();
    }
    public List<Employee> getEmployees(){
        return dslContext.selectFrom(Tables.EMPLOYEE).fetchInto(Employee.class);
    }
    public List<Employee> getByID(int ID){
        return dslContext.select().from(Tables.EMPLOYEE).where(Tables.EMPLOYEE.ID.equal(ID))
                .fetchInto(Employee.class);
    }

    public boolean deleteEmployee(int toFindID){
        return dslContext.deleteFrom(Tables.EMPLOYEE).where(Tables.EMPLOYEE.ID.equal(toFindID)).execute() >= 1;
    }

    public void updateBook(Book book){

    }


}
