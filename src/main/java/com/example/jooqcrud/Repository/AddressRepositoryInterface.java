package com.example.jooqcrud.Repository;

import com.example.jooqcrud.Model.AddressModel;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Address;

public interface AddressRepositoryInterface {
     Address getAddressByID(int addressId);
     void insertAddress(AddressModel addressModel);

}
