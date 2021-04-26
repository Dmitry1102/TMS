package com.practise.robot.heads;

public class SonyHead implements IHead {
    private int price = 10;


    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {

    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("(Sony) Говорит голова Sony...");
    }

    @Override
    public int getPrice() {

        return price;
    }
}
