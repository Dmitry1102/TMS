package com.military.profile;

import java.util.ArrayList;
import java.util.Scanner;

public class Info {
    private static final Scanner in = new Scanner(System.in);
    private static final PersonRegistry personRegistry = new PersonRegistry(new ArrayList<>());
    public final String CITY = "Минск";
    public String NAME = "Александр";
    public final String MAN = "Мужчина";
    public final String COUNTRY = "Беларусь";

    private void enterPerson() {
        System.out.println("Enter name: ");
        String name;
        while (!(name = in.nextLine()).matches("[а-яА-Я]+")) ;
        System.out.println("Enter sex: ");
        String sex;
        while (!(sex = in.nextLine()).matches("[а-яА-Я]+")) ;
        System.out.println("Enter age: ");
        int age = in.nextInt();
        System.out.println("Enter city: ");
        String city;
        while (!(city = in.nextLine()).matches("[а-яА-Я]+")) ;
        System.out.println("Enter country: ");
        String country;
        while (!(country = in.nextLine()).matches("[а-яА-Я]+")) ;
        Address address = new Address(city, country);
        Person person = new Person(name, age, sex, address);
        if (country.equals(COUNTRY)) {
            if (sex.equals(MAN)) {
                if (age >= 18 && age < 27) {
                    personRegistry.getPersonList().add(person);
                } else {
                    System.out.println("Не проходит до призыва по возрасту...");
                }
            } else {
                System.out.println("Женшины не являются военнообязаными...");

            }
        } else {
            System.out.println("Гражданин Другого Государства...");
        }
        System.out.println();
    }

    public void enterPersons() {
        System.out.println("Enter count: ");
        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            enterPerson();
        }
    }

    public void rightCity() {
        for (var person : personRegistry.getPersonList()) {
            if (person.getAdress().getCity().equals(CITY)) {
                System.out.println(person);
            }
        }
    }

    public void ageCompare() {
        for (var person : personRegistry.getPersonList()) {
            if (person.getAge() >= 25 && person.getAge() < 27) {
                System.out.println(person);
            }
        }
    }

    public void nameCompare() {
        for (var person : personRegistry.getPersonList()) {
            if (person.getName().equals(NAME)) {
                System.out.println(person);
            }
        }
    }
}
