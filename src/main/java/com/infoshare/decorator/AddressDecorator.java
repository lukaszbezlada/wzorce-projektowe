package com.infoshare.decorator;

import lombok.AllArgsConstructor;
import lombok.experimental.Delegate;

@AllArgsConstructor
public class AddressDecorator {

    @Delegate(excludes = AddressDecoratorExcludes.class)
    private final Address address;

    private String getStreet() {

        return String.format("ul. %s", address.getStreet());
    }

    private String getCityUpperCase() {

        String city = address.getCity();
        return city != null ? city.toUpperCase() : null;
    }
}
