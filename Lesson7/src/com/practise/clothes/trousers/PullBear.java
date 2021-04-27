package com.practise.clothes.trousers;

public class PullBear implements ITrousers {
    @Override
    public void putOn() {
        System.out.println("Pull&Bear trousers on...");
    }

    @Override
    public void putOff() {
        System.out.println("Pull&Bear trousers off...");
    }
}
