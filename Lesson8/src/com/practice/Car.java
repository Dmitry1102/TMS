package com.practice;

import java.util.Random;

public class Car {
    private String type;
    private int speed;
    private int cost;

    public Car(String type, int speed, int cost) {
        this.type = type;
        this.speed = speed;
        this.cost = cost;
    }

    public Car() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void start() throws CarStartException, NullParamsException {
        Random random = new Random();
        int randomNumber = random.nextInt(20);
        if (type != null || speed != 0 || cost != 0) {
            if (randomNumber % 2 != 0) {
                System.out.println("Автомобиль: " + type + " завелся....");
            } else throw new CarStartException("Exception: CarStartException thrown");
        } else throw new NullParamsException("Exception: NullParamsException thrown");

    }

}
