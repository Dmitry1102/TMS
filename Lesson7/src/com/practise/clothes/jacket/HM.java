package com.practise.clothes.jacket;

public class HM implements IJacket {
    @Override
    public void putOn() {
        System.out.println("H&M jacket on...");
    }

    @Override
    public void putOff() {
        System.out.println("H&M jacket off...");
    }
}
