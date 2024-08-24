package com.gof.behavioral.facade;

public class AppZipCode {

    public static String getAddress(String zipcode) {
        return "1234 Maple Street, Springfield, IL 62701, USA - " + zipcode;
    }
}
