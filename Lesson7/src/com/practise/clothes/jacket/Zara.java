package com.practise.clothes.jacket;

public class Zara implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Zara jacket on...");
    }

    @Override
    public void putOff() {
        System.out.println("Zara jacket off...");
    }
}
