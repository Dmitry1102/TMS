package com.practise.clothes.boots;

public class Puma implements IBoots {
    @Override
    public void putOn() {
        System.out.println("Puma sneakers on...");
    }

    @Override
    public void putOff() {
        System.out.println("Puma sneakers off...");
    }
}
