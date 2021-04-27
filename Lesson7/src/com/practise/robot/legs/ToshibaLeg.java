package com.practise.robot.legs;

public class ToshibaLeg implements ILeg {
    private int price = 4;


    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {

    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("(Toshiba) сделал шаг...");
    }

    @Override
    public int getPrice() {

        return price;
    }
}
