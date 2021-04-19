package com.factory.main.transport.Airtransport.army;

import com.factory.main.Input;
import com.factory.main.Print;
import com.factory.main.transport.Airtransport.AirTransport;
import com.factory.main.transport.Transport;

import java.util.ArrayList;
import java.util.List;


public class Army extends AirTransport implements Print {
    private Army army;
    private boolean catapult;
    private int rocketCount;
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

    public Army(Transport transport, AirTransport airTrans, boolean catapult, int countRocket) {
        super(transport, airTrans.getWings(), airTrans.getMinLength(), airTrans.getTypeOfAir());
        this.catapult = catapult;
        rocketCount = countRocket;
    }


    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }


    public boolean isCatapult() {
        return catapult;
    }

    public void setCatapult(boolean catapult) {
        this.catapult = catapult;
    }

    public int getRocketCount() {
        return rocketCount;
    }

    public void setRocketCount(int rocketCount) {
        this.rocketCount = rocketCount;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }

    public int getLastChoise() {
        return LastChoise;
    }

    public void setLastChoise(int lastChoise) {
        LastChoise = lastChoise;
    }

    public int getNumberTransport() {
        return numberTransport;
    }

    public void setNumberTransport(int numberTransport) {
        this.numberTransport = numberTransport;
    }


    public boolean catapultation() {
        if (isCatapult()) {
            System.out.println("Catapultation is working...");
            return isCatapult();
        } else {
            System.out.println("You haven't got this system");
            return isCatapult();
        }
    }

    public void shoot() {
        int count = getRocketCount();
        while (count > 0) {
            count--;
            if (count != 0) {
                System.out.println("Rocket has gone...");
            } else {
                System.out.println("No Rockets...");
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
        return "Army \n the availability of catapult: " + catapult +
                "\n count of rockets: " + rocketCount;
    }

    @Override
    public void print() {
        List<Army> armyList = new ArrayList<>();
        Input input = new Input();
        powerStatement(getPower());
        setArmy(new Army(getTransport(), getAirTransport(), isCatapult(), getRocketCount()));
        for (int i = 0; i < getNumberTransport(); i++) {
            armyList.add(getArmy());
        }
        System.out.println("Army info: " + getPower() + "kb " + getMaxSpeed() + "km/h " + getWeight() + "kg "
                + getWings() + "m " + getMinLength() + "m  is there catapultation system? " + isCatapult() + " " + getRocketCount() + "rockets");
    }
}
