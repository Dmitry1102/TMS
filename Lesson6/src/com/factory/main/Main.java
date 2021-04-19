package com.factory.main;

import com.factory.main.transport.Airtransport.army.Army;
import com.factory.main.transport.Airtransport.civilPlane.Civil;
import com.factory.main.transport.GroundTransport.LiteWeight.LiteWeight;
import com.factory.main.transport.GroundTransport.Truck.Truck;

import java.util.Scanner;

public class Main {
    static Civil civil;
    static LiteWeight liteWeight;
    static Army army;
    static Truck truck;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        input.fillInfo();


        Print civil1 = input.getCivil();
        civil1.print();
        System.out.println();

        Print truck1 = input.getTruck();
        truck1.print();
        System.out.println();

        Print lite = input.getLiteWeight();
        lite.print();
        System.out.println();

        Print army1 = input.getArmy();
        army1.print();
        System.out.println();

        System.out.println("Input Time: ");
        float time = scanner.nextFloat();
        liteWeight.countData(time);
        System.out.println();

        truck.checkCapacity();
        System.out.println();

        civil.checkPlace();
        System.out.println();

        army.shoot();
        System.out.println();

        army.catapultation();


    }
}
