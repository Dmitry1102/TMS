package com.factory.main.entity;

import java.util.Scanner;

public class Truck extends GroundTransport {
    static Scanner scanner = new Scanner(System.in);
    private int liftingCapacity;

    public Truck(int power, int maxSpeed, int weight, String type, int countWheels, int consumption, int typeOfGround, int liftingCapacity) {
        super(power, maxSpeed, weight, type, countWheels, consumption, typeOfGround);
        this.liftingCapacity = liftingCapacity;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public void checkCapacity() {
        System.out.println("Input your cargo: ");
        int num = scanner.nextInt();
        if (num > getLiftingCapacity()) {
            System.out.print("You need a bigger truck... ");
        } else {
            System.out.println("Truck is full...");
        }
    }

    public void print() {
        System.out.println("Truck \n Capacity:" + liftingCapacity);
    }


}
