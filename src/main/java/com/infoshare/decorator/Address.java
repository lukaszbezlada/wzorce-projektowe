package com.infoshare.decorator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {

    private int id;
    private String city;
    private String postalCode;
    private String local;
    private String street;

}
