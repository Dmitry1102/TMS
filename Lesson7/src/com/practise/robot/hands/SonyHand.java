package com.practise.robot.hands;

public class SonyHand implements IHand {
    private int price = 5;


    public SonyHand() {

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public SonyHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("(Sony) Рука поднята...");
    }

    @Override
    public int getPrice() {

        return price;

    }
}
