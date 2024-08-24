package com.gof.structural.strategy;

public class Stop implements Direction {
    @Override
    public void move() {
        System.out.println("STOP");
    }
}
