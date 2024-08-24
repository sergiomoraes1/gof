package com.gof.structural.strategy;

public class Forward implements Direction {
    @Override
    public void move() {
        System.out.println("GO GO");
    }
}
