package com.practice;


public class Main {
    public static void main(String[] args) throws CarStartException, NullParamsException {

        Car honda = new Car(Types.HONDA.toString(), 200, 2100000);
        Car ford = new Car(Types.FORD.toString(), 200, 2000000);
        Car bmw = new Car(Types.BMW.toString(), 250, 2900000);
        Car mercedes = new Car(Types.MERCEDES.toString(), 300, 3000000);
        Car car = new Car();

        honda.start();
        System.out.println();
        ford.start();
        System.out.println();
        bmw.start();
        System.out.println();
        mercedes.start();
        System.out.println();
        car.start();


    }
}

