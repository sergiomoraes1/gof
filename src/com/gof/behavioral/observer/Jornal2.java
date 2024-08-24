package com.gof.behavioral.observer;

public class Jornal2 implements Observer {
    private final String name;

    public Jornal2(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " recebeu a mensagem: " + message);
    }
}
