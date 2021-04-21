package com.practise.spaceport;

import java.util.Scanner;

public class RosCosmos implements IStart {
    @Override
    public boolean checkOutSystem() {
        System.out.println("Введите бюджет не постройку ракеты:");
        Scanner scanner = new Scanner(System.in);
        int budget = scanner.nextInt();
        System.out.println("Этого бюджета недостаточно");
        int budget2 = scanner.nextInt();
        if (budget2 / 2 > 600) {
            return true;
        } else {
            System.out.println("Нам нужно больше времени и денег");
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели рокеты запущены.Все системы в норме...");
    }

    @Override
    public void start() {
        System.out.println("Наконец-то хоть что то полетело...");
    }
}
