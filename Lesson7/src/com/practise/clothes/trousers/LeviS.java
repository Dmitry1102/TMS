package com.practise.clothes.trousers;

public class LeviS implements ITrousers {
    @Override
    public void putOn() {
        System.out.println("Levi's jeans on...");
    }

    @Override
    public void putOff() {
        System.out.println("Levi's jeans off...");
    }
}
