package com.infoshare.builder;

import lombok.Builder;
import lombok.experimental.Delegate;

@Builder
public class Sample {
    private int id;
    private String city;
    private String postalCode;
    private String local;

    @Delegate //deleguje dostęp do getterów i setterów
    private Adress adress;
}
