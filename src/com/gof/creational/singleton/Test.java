package com.gof.creational.singleton;

public class Test {

    public static void main(String[] args) {

        // Singleton
        System.out.println(Singleton.getInstancia());
        System.out.println(Singleton.getInstancia());
        System.out.println(Singleton.getInstancia());

    }
}
