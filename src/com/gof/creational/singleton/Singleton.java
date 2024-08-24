package com.gof.creational.singleton;

public class Singleton {

    private static final Singleton instancia = new Singleton();

    private Singleton() {
        super();
    }

    public static Singleton getInstancia() {
        return instancia;
    }
    
}
