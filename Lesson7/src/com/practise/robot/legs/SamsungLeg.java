package com.practise.robot.legs;

public class SamsungLeg implements ILeg {

    private int price = 6;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {

    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("(Samsung) сделал шаг...");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
