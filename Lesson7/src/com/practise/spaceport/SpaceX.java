package com.practise.spaceport;

public class SpaceX implements IStart {


    @Override
    public boolean checkOutSystem() {
        return true;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели рокеты SpaceX запущены.Все системы в норме...");
    }

    @Override
    public void start() {
        System.out.println("Cтарт рокеты SpaceX...");
    }
}
