package com.practise.clothes;

import com.practise.clothes.boots.IBoots;
import com.practise.clothes.jacket.IJacket;
import com.practise.clothes.trousers.ITrousers;

public class Person implements IPerson {

    private String name;
    private IBoots boots;
    private IJacket jacket;
    private ITrousers trousers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IBoots getBoots() {
        return boots;
    }

    public void setBoots(IBoots boots) {
        this.boots = boots;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public ITrousers getTrousers() {
        return trousers;
    }

    public void setTrousers(ITrousers trousers) {
        this.trousers = trousers;
    }

    public Person(String name, IBoots boots, IJacket jacket, ITrousers trousers) {
        this.name = name;
        this.boots = boots;
        this.jacket = jacket;
        this.trousers = trousers;
    }

    @Override
    public void putOn() {
        System.out.println("Common " + name + " we need to go...");
        System.out.println("Time to put on trousers:");
        trousers.putOn();
        System.out.println("Next you have to put on jacket:");
        jacket.putOn();
        System.out.println("Next go sneakers:");
        boots.putOn();
    }

    @Override
    public void putOff() {
        System.out.println(name + ": I want to sleep");
        System.out.println("Take off yor jacket:");
        jacket.putOff();
        System.out.println("Next take off your sneakers:");
        boots.putOff();
        System.out.println("Take off yor trousers:");
        trousers.putOff();
    }
}
