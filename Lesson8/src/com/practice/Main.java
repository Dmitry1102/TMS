package com.practice;

public class Main {
    public static void main(String[] args) throws CarStartException, NullParamsException {

        Start honda = new Car(Types.HONDA.toString(), 200, 2100000);
        Start ford = new Car(Types.FORD.toString(), 200, 2000000);
        Start bmw = new Car(Types.BMW.toString(), 250, 2900000);
        Start mercedes = new Car(Types.MERCEDES.toString(), 300, 3000000);
        Start car = new Car();


        Start[] carList = {honda, ford, bmw, mercedes, car};
        for (int i = 0; i < carList.length; i++) {
            try {
                carList[i].start();
                System.out.println();
            } catch (CarStartException e) {
                System.out.println(e.getMessage());
            }

        }


    }



}

