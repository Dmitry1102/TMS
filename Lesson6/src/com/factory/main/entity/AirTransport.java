package com.factory.main.entity;

public abstract class AirTransport extends Transport {
    private int wings;
    private int minLength;
    private int typeOfAir;

    public int getTypeOfAir() {
        return typeOfAir;
    }

    public void setTypeOfAir(int typeOfAir) {
        this.typeOfAir = typeOfAir;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    public AirTransport(int power, int maxSpeed, int weight, String type, int wings, int minLength, int typeOfAir) {
        super(power, maxSpeed, weight, type);
        this.wings = wings;
        this.minLength = minLength;
        this.typeOfAir = typeOfAir;
    }

}
