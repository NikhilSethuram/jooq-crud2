package com.example.jooqcrud.service;

import com.example.jooqcrud.Model.EmployeeModel;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Address;

public interface AddressServiceInterface {
     EmployeeModel.AddressModel getAddressByID(int ID);
     void insertAddress(Address address);
}
