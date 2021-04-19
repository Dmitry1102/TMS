package com.factory.main.transport.GroundTransport.LiteWeight;

import com.factory.main.Input;
import com.factory.main.Print;
import com.factory.main.transport.GroundTransport.GroundTransport;
import com.factory.main.transport.Transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiteWeight extends GroundTransport implements Print {
    private Scanner scanner = new Scanner(System.in);
    private String typeBody;
    private int countPassengers;
    private int power;
    private LiteWeight liteWeight;
    private int numberTransport;
    private float time;
    private GroundTransport groundTransport;

    public LiteWeight(Transport transport, GroundTransport groundTransport, String typeBody, int passengers) {
        super(transport, groundTransport.getCountWheels(), groundTransport.getConsumption(), groundTransport.getTypeOfGround());
        this.typeBody = typeBody;
        countPassengers = passengers;
    }


    public GroundTransport getGroundTransport() {
        return groundTransport;
    }

    public void setGroundTransport(GroundTransport groundTransport) {
        this.groundTransport = groundTransport;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public int getNumberTransport() {
        return numberTransport;
    }

    public void setNumberTransport(int numberTransport) {
        this.numberTransport = numberTransport;
    }

    public LiteWeight getLiteWeight() {
        return liteWeight;
    }

    public void setLiteWeight(LiteWeight liteWeight) {
        this.liteWeight = liteWeight;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
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

    private int powerStatement(int power) {
        power *= Print.MULTIPLENUMBER;
        setPower(power);
        return getPower();
    }

    public void countData(float time) {
        float distance = time * getMaxSpeed();
        System.out.println("In time " + time + "h ,Lite weight transport going " + getMaxSpeed() +
                "km/h pass " + distance + "km \n the amount of fuel you need on this distance " + countFuel(distance) + "l");
    }

    private float countFuel(float dis) {
        return dis * getConsumption();
    }


    @Override
    public String toString() {
        return "LiteWeight \n type of car:" + typeBody + "\n count of passengers " + countPassengers;
    }


    @Override
    public void print() {
        Input input = new Input();
        liteWeight = input.getLiteWeight();
        List<LiteWeight> liteWeights = new ArrayList<>();
        powerStatement(getPower());
        setLiteWeight(new LiteWeight(getTransport(), getGroundTransport(), getTypeBody(), getCountPassengers()));
        for (int i = 0; i < getNumberTransport(); i++) {
            liteWeights.add(getLiteWeight());
        }
        System.out.println("Lite weight info: " + getPower() + "kb " + getMaxSpeed() + "km/h " + getWeight() + "kg " + getCountWheels() + "wheels "
                + getConsumption() + "consumption " + getTypeBody() + "body " + getCountPassengers() + "person ");

    }
}
