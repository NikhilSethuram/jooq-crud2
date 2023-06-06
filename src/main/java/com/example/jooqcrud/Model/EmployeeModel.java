package com.example.jooqcrud.Model;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeModel {
    private Integer id;
    private String name;
    private String email;
    private AddressModel addressModel;
}

