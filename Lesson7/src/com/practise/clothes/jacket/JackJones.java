package com.practise.clothes.jacket;

public class JackJones implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Jack&Jones jacket on...");
    }

    @Override
    public void putOff() {
        System.out.println("Jack&Jones jacket off...");
    }
}
