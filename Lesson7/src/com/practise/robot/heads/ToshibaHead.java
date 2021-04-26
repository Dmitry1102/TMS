package com.practise.robot.heads;

public class ToshibaHead implements IHead {

    private int price = 8;


    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {

    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("(Toshiba) Говорит голова Toshiba...");
    }

    @Override
    public int getPrice() {
        return price;
    }
}