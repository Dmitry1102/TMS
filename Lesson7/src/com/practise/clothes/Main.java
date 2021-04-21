package com.practise.clothes;

import com.practise.clothes.boots.Adidas;
import com.practise.clothes.boots.IBoots;
import com.practise.clothes.boots.Puma;
import com.practise.clothes.boots.Reebok;
import com.practise.clothes.jacket.HM;
import com.practise.clothes.jacket.IJacket;
import com.practise.clothes.jacket.JackJones;
import com.practise.clothes.jacket.Zara;
import com.practise.clothes.trousers.Colins;
import com.practise.clothes.trousers.ITrousers;
import com.practise.clothes.trousers.LeviS;
import com.practise.clothes.trousers.PullBear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IJacket hmJacket = new HM();
        IJacket jackJacket = new JackJones();
        IJacket zaraJacket = new Zara();

        ITrousers colinsTrousers = new Colins();
        ITrousers pullTrousers = new PullBear();
        ITrousers levisTrousers = new LeviS();

        IBoots adidasBoots = new Adidas();
        IBoots pumaBoots = new Puma();
        IBoots reebokBoots = new Reebok();

        System.out.println("Input the name");
        String name = scanner.nextLine();
        System.out.println();

        Person person = new Person(name, adidasBoots, zaraJacket, levisTrousers);
        person.putOn();
        System.out.println();
        person.putOff();


    }
}
