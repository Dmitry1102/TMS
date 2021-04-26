package com.factory.main.entity;

public abstract class GroundTransport extends Transport {
    private int countWheels;
    private int consumption;
    private int typeOfGround;

    public GroundTransport(int power, int maxSpeed, int weight, String type, int countWheels, int consumption, int typeOfGround) {
        super(power, maxSpeed, weight, type);
        this.countWheels = countWheels;
        this.consumption = consumption;
        this.typeOfGround = typeOfGround;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public int getTypeOfGround() {
        return typeOfGround;
    }

    public void setTypeOfGround(int typeOfGround) {
        this.typeOfGround = typeOfGround;
    }


}
