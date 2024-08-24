package com.gof.structural.strategy;

public class Right implements Direction {
    @Override
    public void move() {
        System.out.println("RIGHT");
    }
}
