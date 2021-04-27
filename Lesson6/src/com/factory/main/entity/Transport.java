package com.factory.main.entity;

public abstract class Transport {
    private static final double MULTIPLE_NUMBER = 0.74;
    private int power;
    private int maxSpeed;
    private int weight;
    private String type;


    private int powerStatement() {
        return (int) Math.round(power * MULTIPLE_NUMBER);
    }

    public Transport(int power, int maxSpeed, int weight, String type) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void print();



}
