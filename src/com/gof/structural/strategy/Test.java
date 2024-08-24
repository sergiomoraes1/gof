package com.gof.structural.strategy;

public class Test {

    public static void main(String[] args) {

        Direction forward = new Forward();
        Direction left = new Left();
        Direction right = new Right();
        Direction reverse = new Reverse();
        Direction stop = new Stop();

        Car car = new Car();
        car.setDirection(forward);
        car.move();
        car.setDirection(left);
        car.move();
        car.setDirection(right);
        car.move();
        car.setDirection(reverse);
        car.move();
        car.setDirection(stop);
        car.move();

    }
}
