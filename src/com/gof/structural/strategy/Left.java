package com.gof.structural.strategy;

public class Left implements Direction {
    @Override
    public void move() {
        System.out.println("LEFT");
    }
}
