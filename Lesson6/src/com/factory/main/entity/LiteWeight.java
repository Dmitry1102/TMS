package com.factory.main.entity;

import java.util.Scanner;

public class LiteWeight extends GroundTransport {
    static Scanner scanner = new Scanner(System.in);
    private String typeBody;
    private int countPassengers;


    public LiteWeight(int power, int maxSpeed, int weight, String type, int countWheels, int consumption, int typeOfGround, String typeBody, int countPassengers) {
        super(power, maxSpeed, weight, type, countWheels, consumption, typeOfGround);
        this.typeBody = typeBody;
        this.countPassengers = countPassengers;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(String typeBody) {
        this.typeBody = typeBody;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }


    public void countData(float time) {
        float distance = time * getMaxSpeed();
        System.out.println("In time " + time + "h ,Lite weight transport going " + getMaxSpeed() +
                "km/h pass " + distance + "km \n the amount of fuel you need on this distance " + countFuel(distance) + "l");
    }

    private float countFuel(float dis) {
        return dis * getConsumption();
    }


    public void print() {
        System.out.println("LiteWeight \n type of car:" + typeBody + "\n count of passengers " + countPassengers);

    }
}
