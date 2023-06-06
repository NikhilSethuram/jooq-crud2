package com.example.jooqcrud.Repository;

import com.example.jooqcrud.Model.EmployeeModel;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Address;

public interface AddressRepositoryInterface {
     Address getAddressByID(int addressId);
     void insertAddress(EmployeeModel.AddressModel addressModel);

}
