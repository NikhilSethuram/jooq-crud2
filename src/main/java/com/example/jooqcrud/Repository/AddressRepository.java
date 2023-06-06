package com.example.jooqcrud.Repository;

import com.example.jooqcrud.Model.EmployeeModel;
import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Address;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class AddressRepository implements AddressRepositoryInterface {
        @Autowired
        private DSLContext dslContext;



        public void insertAddress(EmployeeModel.AddressModel addressModel) {
                dslContext.insertInto(Tables.ADDRESS, Tables.ADDRESS.ID, Tables.ADDRESS.ADDRESS_)
                        .values(addressModel.getId(), addressModel.getAddress())
                        .execute();
        }

        @Override
        public Address getAddressByID(int addressId) {
                List<Address> list1= dslContext.select().from(Tables.ADDRESS).where(Tables.ADDRESS.ID.equal(addressId))
                        .fetchInto(Address.class);
                return list1.get(0);
        }
}
