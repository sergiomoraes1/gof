package com.gof.behavioral.observer;

public class Jornal1 implements Observer {
    private final String name;

    public Jornal1(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received a message: " + message);
    }
}
