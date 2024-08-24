package com.gof.behavioral.facade;

public class AppClient {

    private AppClient() {
        super();
    }

    public static void saveClient(String name, String zipcode, String street) {
        System.out.println("Client saved successfully.");
        System.out.println(name);
        System.out.println(zipcode);
        System.out.println(street);
    }
}
