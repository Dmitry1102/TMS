package com.factory.main.transport.Airtransport.civilPlane;

import com.factory.main.Input;
import com.factory.main.Print;
import com.factory.main.transport.Airtransport.AirTransport;
import com.factory.main.transport.Transport;

import java.util.ArrayList;
import java.util.List;


public class Civil extends AirTransport implements Print {
    private int countPassengers;
    private Civil civil;
    private boolean business;
    private int power;
    private int LastChoise;
    private int numberTransport;
    private AirTransport airTransport;

    public AirTransport getAirTransport() {
        return airTransport;
    }

    public void setAirTransport(AirTransport airTransport) {
        this.airTransport = airTransport;
    }

    public Civil(Transport transport, AirTransport airTrans, int countPassengers, boolean business) {
        super(transport, airTrans.getWings(), airTrans.getMinLength(), airTrans.getTypeOfAir());
        this.countPassengers = countPassengers;
        this.business = business;
    }

    public Civil getCivil() {
        return civil;
    }

    public void setCivil(Civil civil) {
        this.civil = civil;
    }

    public int getNumberTransport() {
        return numberTransport;
    }

    public void setNumberTransport(int numberTransport) {
        this.numberTransport = numberTransport;
    }

    public int getLastChoise() {
        return LastChoise;
    }

    public void setLastChoise(int lastChoise) {
        LastChoise = lastChoise;
    }


    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public boolean isBusiness() {
        return business;
    }

    public void setBusiness(boolean business) {
        this.business = business;
    }


    public void checkPlace() {
        int i = getCountPassengers();
        while (i > 0) {
            i--;
            if (i != 0) {
                System.out.print("Go to your place, please");
            } else {
                System.out.println("Sorry all places are taken");
            }
        }
    }


    private int powerStatement(int power) {
        power *= Print.MULTIPLENUMBER;
        setPower(power);
        return getPower();
    }


    @Override
    public String toString() {
        return "Civil \n count of passengers: " + countPassengers +
                "\n status of business class: " + business;
    }

    @Override
    public void print() {
        Input input = new Input();
        civil = input.getCivil();
        List<Civil> civil12 = new ArrayList<>();
        powerStatement(getPower());
        setCivil(new Civil(getTransport(), getAirTransport(), getCountPassengers(), isBusiness()));
        for (int i = 0; i < getNumberTransport(); i++) {
            civil12.add(getCivil());
        }
        System.out.println("Civil info: " + getPower() + "kb " + getMaxSpeed() + "km/h " + getWeight() + "kg "
                + getWings() + "m " + getMinLength() + "m " + getCountPassengers() + "persons  is business class? " + isBusiness());

    }
}
