package com.gof.structural.strategy;

public class Car {

    private Direction direction;

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void move() {
        direction.move();
    }

}
