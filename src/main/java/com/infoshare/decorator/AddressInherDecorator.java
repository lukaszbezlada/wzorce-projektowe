package com.infoshare.decorator;

public class AddressInherDecorator extends Address {

    public AddressInherDecorator(int id, String city, String postalCode, String local, String street) {
        super(id, city, postalCode, local, street);
    }

    @Override
    public String getStreet() {
        return String.format("ul. %s", super.getStreet());
    }

    private String getCityUpperCase() {

        String city = getCity();
        return city != null ? city.toUpperCase() : null;
    }

}

