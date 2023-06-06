package com.example.jooqcrud.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeModel {
    private Integer id;
    private String name;
    private AddressModel addressModel;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AddressModel{
        private Integer id;
        private String address;
    }
}
