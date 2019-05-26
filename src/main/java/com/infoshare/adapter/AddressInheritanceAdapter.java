package com.infoshare.adapter;

import lombok.Setter;

@Setter
public class AddressInheritanceAdapter extends Adres {

    public AddressInheritanceAdapter() {
    }

    public int getId() {
        return super.getId();
    }

    public String getCity() {
        return super.getMiasto();
    }

    public  String getPostalCode() {
        return super.getKod();
    }

    public String getLocal() {
        return super.getRegion();
    }
}
