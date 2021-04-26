package com.factory.main.entity;


public class Army extends AirTransport {
    private boolean catapult;
    private int rocketCount;

    public Army(int power, int maxSpeed, int weight, String type, int wings, int minLength, int typeOfAir, boolean catapult, int rocketCount) {
        super(power, maxSpeed, weight, type, wings, minLength, typeOfAir);
        this.catapult = catapult;
        this.rocketCount = rocketCount;
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
        while (rocketCount > 0) {
            System.out.println("Rocket has gone...");
            rocketCount--;
        }
        System.out.println("No Rockets...");

    }


    public void print() {
        System.out.println("Army \n the availability of catapult: " + catapult +
                "\n count of rockets: " + rocketCount);
    }
}
