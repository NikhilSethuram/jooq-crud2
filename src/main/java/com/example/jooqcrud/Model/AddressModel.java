package com.example.jooqcrud.Model;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressModel{
    private Integer id;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String pincode;
    private String country;

}

