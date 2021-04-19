package com.factory.main.transport.GroundTransport.Truck;

import com.factory.main.Input;
import com.factory.main.Print;
import com.factory.main.transport.GroundTransport.GroundTransport;
import com.factory.main.transport.Transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Truck extends GroundTransport implements Print {
    private Scanner scanner = new Scanner(System.in);
    private int numberTransport;
    private GroundTransport groundTransport;
    private Truck truck;
    private int liftingCapacity;
    private int power;

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }

    public Truck(Transport transport, GroundTransport groundTransport, int liftingCapacity) {
        super(transport, groundTransport.getCountWheels(), groundTransport.getConsumption(), groundTransport.getTypeOfGround());
        this.liftingCapacity = liftingCapacity;
    }

    public int getNumberTransport() {
        return numberTransport;
    }

    public void setNumberTransport(int numberTransport) {
        this.numberTransport = numberTransport;
    }

    public GroundTransport getGroundTransport() {
        return groundTransport;
    }

    public void setGroundTransport(GroundTransport groundTransport) {
        this.groundTransport = groundTransport;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    private int powerStatement(int power) {
        power *= Print.MULTIPLENUMBER;
        setPower(power);
        return getPower();
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

    public void print(List<Truck> trucks, Truck truck) {

    }

    @Override
    public String toString() {
        return "Truck \n Capacity: " + liftingCapacity;
    }

    @Override
    public void print() {
        List<Truck> truckList = new ArrayList<>();
        Input input = new Input();
        truck = input.getTruck();
        powerStatement(getPower());
        setTruck(new Truck(getTransport(), getGroundTransport(), getLiftingCapacity()));
        for (int i = 0; i < getNumberTransport(); i++) {
            truckList.add(truck);
        }
        System.out.println("Truck info" + getPower() + "kb " + getMaxSpeed() + "km/h " + getWeight() + "kg " + getCountWheels() + "wheels "
                + getConsumption() + "consumption " + getLiftingCapacity() + "capacity");

    }
}
