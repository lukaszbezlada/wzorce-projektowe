package com.infoshare.adapter;

public class AddressClient {

    public void main(Adres address){

        //przykład korzystania z adaptera przez kompozycję
        AddressAdapter addressAdapter = new AddressAdapter(address);
        addressAdapter.getCity();

        //przykład korzystania z adaptera przez dziedziczenie
        AddressInheritanceAdapter addressInheritanceAdapter = new AddressInheritanceAdapter();
        addressInheritanceAdapter.setId(0);
    }
}
