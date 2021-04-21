package com.practise.spaceport;

import java.util.Random;

public class Shuttle implements IStart {


    @Override
    public boolean checkOutSystem() {
        Random random = new Random();
        int generetedNumber = random.nextInt(10);
        System.out.println("Созданное число: " + generetedNumber);
        if (generetedNumber > 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены.Все системы в норме...");
    }

    @Override
    public void start() {
        System.out.println("Cтарт Шатла...");
    }
}
