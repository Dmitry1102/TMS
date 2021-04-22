package com.practise.robot.hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {

    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("(Samsung) Рука поднята...");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
