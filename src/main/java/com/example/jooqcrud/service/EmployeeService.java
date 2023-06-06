package com.example.jooqcrud.service;

import com.example.jooqcrud.Model.AddressModel;
import com.example.jooqcrud.Model.EmployeeModel;
import com.example.jooqcrud.Repository.AddressRepository;
import com.example.jooqcrud.Repository.EmployeeRepository;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Address;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Employee;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceInterface {
    @Autowired
    private EmployeeRepository employeeRepository;
    private AddressRepository addressRepository;

    @Override
    public void insertEmployee(Employee employee) {
        EmployeeModel model = new EmployeeModel();
        AddressModel addmodel= new AddressModel();
        Address address = addressRepository.getAddressByID(employee.getId());
        BeanUtils.copyProperties(employee,model);
        BeanUtils.copyProperties(address,addmodel);
        //the insert of employee method calls addrrep to insert address
        employeeRepository.insert(model);
    }

    @Override
    public List<EmployeeModel> getAllEmployees() {
        List<EmployeeModel> modellist= new ArrayList<>();
         List<Employee> list1=employeeRepository.getEmployees();
         for(Employee emp: list1){
             EmployeeModel model = new EmployeeModel();
             BeanUtils.copyProperties(emp,model);
             modellist.add(model);
         }
         return modellist;
    }

    @Override
    public EmployeeModel getEmployeeByID(int ID) {
        Employee employee = employeeRepository.getByID(ID);
        EmployeeModel model = new EmployeeModel();
        BeanUtils.copyProperties(employee,model);

        Address address = addressRepository.getAddressByID(employee.getId());
        AddressModel addressModel = new AddressModel();
        BeanUtils.copyProperties(address, addressModel);

        model.setAddressModel(addressModel);
        return model;
    }

    @Override
    public String deleteEmployee(int ID) {
        employeeRepository.deleteEmployee(ID);
        return "Book Deleted";
    }

    @Override
    public String updateEmployee(int ID,Employee employee) {
        EmployeeModel updatedEmployee = new EmployeeModel();
        BeanUtils.copyProperties(employee, updatedEmployee);
        employeeRepository.updateEmployee(ID, updatedEmployee);
        return "Employee Updated";
    }
}