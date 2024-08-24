package com.gof.behavioral.facade;

public class Facade {

    public void saveClient(String name, String zipcode) {

        String address = AppZipCode.getAddress(zipcode);
        AppClient.saveClient(name, zipcode, address);

    }

}
