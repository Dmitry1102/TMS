package com.practise.robot.heads;

public class SamsungHead implements IHead {

    private int price = 13;

    public SamsungHead() {

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public SamsungHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("(Samsung) Говорит голова Samsung...");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
