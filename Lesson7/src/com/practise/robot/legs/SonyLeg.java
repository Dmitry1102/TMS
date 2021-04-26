package com.practise.robot.legs;

public class SonyLeg implements ILeg {
    private int price = 5;


    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {

    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("(Sony) сделал шаг...");
    }

    @Override
    public int getPrice() {

        return price;
    }
}
