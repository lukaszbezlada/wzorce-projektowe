package com.infoshare.adapter;

import lombok.AllArgsConstructor;
import lombok.experimental.Delegate;

@AllArgsConstructor
public class AddressAdapter {

    @Delegate(excludes = AdapterExcluded.class) //dodaje gettery z Adres
    private final Adres adres;  //przez kompozycję

    public int getId() {
        return adres.getId();
    }

    public String getCity() {
        return adres.getMiasto();
    }

    public  String getPostalCode() {
        return adres.getKod();
    }

    public String getLocal() {
        return adres.getRegion();
    }
}
