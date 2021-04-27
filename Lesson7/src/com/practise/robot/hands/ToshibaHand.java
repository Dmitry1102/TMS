package com.practise.robot.hands;

public class ToshibaHand implements IHand {
    private int price = 4;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {

    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("(Toshiba) Рука поднята...");
    }

    @Override
    public int getPrice() {

        return price;
    }
}
