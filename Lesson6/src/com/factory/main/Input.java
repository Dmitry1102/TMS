package com.factory.main;

import com.factory.main.transport.Airtransport.AirTransport;
import com.factory.main.transport.Airtransport.army.Army;
import com.factory.main.transport.Airtransport.civilPlane.Civil;
import com.factory.main.transport.GroundTransport.GroundTransport;
import com.factory.main.transport.GroundTransport.LiteWeight.LiteWeight;
import com.factory.main.transport.GroundTransport.Truck.Truck;
import com.factory.main.transport.Transport;

import java.util.Random;
import java.util.Scanner;

public class Input {
    Transport transport;
    AirTransport airTrans;
    GroundTransport groundTransport;
    private LiteWeight liteWeight;
    private Civil civil;
    private Army army;
    private Truck truck;
    Random random = new Random();


    static final Scanner scanner = new Scanner(System.in);

    public LiteWeight getLiteWeight() {
        return liteWeight;
    }

    public void setLiteWeight(LiteWeight liteWeight) {
        this.liteWeight = liteWeight;
    }

    public Civil getCivil() {
        return civil;
    }

    public void setCivil(Civil civil) {
        this.civil = civil;
    }

    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    public void fillInfo() {
        System.out.println("Good morning, please complete the list:");
        System.out.println("input the power: ");
        int power = scanner.nextInt();
        System.out.println("input maximum speed: ");
        int maxSpeed = scanner.nextInt();
        System.out.println("Input the weight: ");
        int weight = scanner.nextInt();
        System.out.println("Input from 1 to 2 type of vehicle: ");
        int type = scanner.nextInt();
        while (type < 1 || type > 2) {
            type = scanner.nextInt();
        }
        transport = new Transport(power, maxSpeed, weight, type);
        switch (type) {
            case 1:
                airTransport();
                break;
            case 2:
                groundTransport();
                break;
            default:
                System.out.println("Something wrong:");
        }


    }

    private void airTransport() {
        System.out.println("Go to Air Transport: ");
        System.out.println("Input the length of wings: ");
        int wingsLength = scanner.nextInt();
        System.out.println("Input the minimum distance of airport road: ");
        int minLength = scanner.nextInt();
        System.out.println("Input the 1 or 2 to concrete type of Air Transport: ");
        int typeOfAir = scanner.nextInt();
        while (typeOfAir < 1 || typeOfAir > 2) {
            typeOfAir = scanner.nextInt();
        }
        airTrans = new AirTransport(transport, wingsLength, minLength, typeOfAir);
        switch (typeOfAir) {
            case 1:
                army();
                break;
            case 2:
                civil();
                break;
            default:
                System.out.println("Air Transport:Something wrong:");
        }
    }

    private void civil() {
        System.out.println("Welcome to civil Airport: ");
        System.out.println("Input count of passengers: ");
        int countPassengers = scanner.nextInt();
        System.out.println("the information of business class availability: ");
        boolean business = random.nextBoolean();
        System.out.println(business);
        civil = new Civil(transport, airTrans, countPassengers, business);

    }

    private void army() {
        System.out.println("Welcome to Army Airport: ");
        System.out.println("the information of catapultation status: ");
        boolean catapult = random.nextBoolean();
        System.out.println(catapult);
        System.out.println("Input the number of rockets: ");
        int countRocket = scanner.nextInt();
        army = new Army(transport, airTrans, catapult, countRocket);


    }

    private void groundTransport() {
        System.out.println("Go to Ground Transport: ");
        System.out.println("Input count of wheels: ");
        int countWheel = scanner.nextInt();
        System.out.println("Input the consumption: ");
        int consumption = scanner.nextInt();
        System.out.println("Input the 1 or 2 to concrete type of Ground Transport: ");
        int typeOfGround = scanner.nextInt();
        while (typeOfGround < 1 || typeOfGround > 2) {
            typeOfGround = scanner.nextInt();
        }
        switch (typeOfGround) {
            case 1:
                liteWeight();
            case 2:
                truck();
            default:
                System.out.println("Ground Transport:Something wrong:");

        }

    }

    private void truck() {
        System.out.println("Truck transport: ");
        System.out.println("Input the capacity of transport: ");
        int liftingCapacity = scanner.nextInt();
        truck = new Truck(transport, groundTransport, liftingCapacity);

    }

    private void liteWeight() {
        System.out.println("Lite weight transport: ");
        System.out.println("Input the name of lite weight transport: ");
        String typeBody = scanner.next();
        System.out.println("Input the number of passengers: ");
        int passengers = scanner.nextInt();
        liteWeight = new LiteWeight(transport, groundTransport, typeBody, passengers);


    }
}
