package com.factory.main.entity;


public class Civil extends AirTransport {
    private int countPassengers;
    private boolean business;


    public Civil(int power, int maxSpeed, int weight, String type, int wings, int minLength, int typeOfAir, int countPassengers, boolean business) {
        super(power, maxSpeed, weight, type, wings, minLength, typeOfAir);
        this.countPassengers = countPassengers;
        this.business = business;
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

        while (countPassengers > 0) {
            System.out.print("Go to your place, please");
            countPassengers--;
        }
        System.out.println("Sorry all places are taken");

    }


    public void print() {
        System.out.println("Civil \n count of passengers: " + countPassengers +
                "\n status of business class: " + business);

    }
}
