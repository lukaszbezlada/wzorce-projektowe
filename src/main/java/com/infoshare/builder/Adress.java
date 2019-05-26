package com.infoshare.builder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Adress {

    private int id;
    private String city;
    private String postalCode;
    private String local;

    public static class Builder {

        private Integer id;
        private String city;
        private String postalCode;
        private String local;

        public Adress.Builder id(int id) {
            this.id = id;
            return this;
        }

        public Adress.Builder city(String city) {
            this.city = city;
            return this;
        }

        public Adress.Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Adress.Builder local(String local) {
            this.local = local;
            return this;
        }

        public Adress builld() {

            if (id != null && city != null && postalCode != null && local != null) {
                return new Adress(id, city, postalCode, local);
            }
            throw new IllegalArgumentException();
        }
    }
}
