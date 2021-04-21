package com.practise.clothes.trousers;

public class Colins implements ITrousers {
    @Override
    public void putOn() {
        System.out.println("Colins jeans on...");
    }

    @Override
    public void putOff() {
        System.out.println("Colins jeans off...");
    }
}
