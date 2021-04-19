package com.factory.main.transport;

public class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private int type;

    public Transport(int power, int maxSpeed, int weight, int type) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "The power of vechicle: " + power + "\n the max speed of vehicle: " + maxSpeed +
                "\n weight: " + weight +
                "\n number of type Transport: " + type + "\n";
    }
}
