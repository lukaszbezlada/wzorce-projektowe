package com.infoshare;

import com.infoshare.builder.Adress;
import com.infoshare.builder.Sample;
import org.junit.Test;

public class BuilderTest {

    @Test
    public  void test() {
        Adress adress = new Adress.Builder()
                .id(0)
                .city("Lublin")
                .postalCode("20-819")
                .local("lubelskie")
                .builld();

        Sample.builder().city("Lublin").postalCode("20-819").local("lubelskie").id(0).build();
    }

}
