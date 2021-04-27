package com.practise.clothes.boots;

public class Adidas implements IBoots {
    @Override
    public void putOn() {
        System.out.println("Adidas sneakers on...");
    }

    @Override
    public void putOff() {
        System.out.println("Adidas sneakers off...");
    }
}
