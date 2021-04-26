package com.practise.clothes.boots;

public class Reebok implements IBoots {
    @Override
    public void putOn() {
        System.out.println("Reebok sneakers on...");
    }

    @Override
    public void putOff() {
        System.out.println("Reebok sneakers off...");
    }
}
