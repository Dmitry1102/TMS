package com.military.profile;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    private static final PersonRegistry personRegistry = new PersonRegistry(new ArrayList<>());
    public static final String CITY = "Минск";
    public static final String NAME = "Александр";
    public static final String MAN = "Мужчина";
    public static final String COUNTRY = "Беларусь";

    public static void enterPerson() {
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

    public static void enterPersons() {
        System.out.println("Enter count: ");
        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            enterPerson();
        }
    }

    public static void rightCity() {
        for (var person : personRegistry.getPersonList()) {
            if (person.getAdress().getCity().equals(CITY)) {
                System.out.println(person);
            }
        }
    }

    public static void ageCompare() {
        for (var person : personRegistry.getPersonList()) {
            if (person.getAge() >= 25 && person.getAge() < 27) {
                System.out.println(person);
            }
        }
    }

    public static void nameCompare() {
        for (var person : personRegistry.getPersonList()) {
            if (person.getName().equals(NAME)) {
                System.out.println(person);
            }
        }
    }


    public static void main(String[] args) {
        enterPersons();
        for (var person : personRegistry.getPersonList()) {
            System.out.println(person);
        }
        System.out.println("Призывники города Минска: ");
        rightCity();
        System.out.println("Призывники от 25 до 27: ");
        ageCompare();
        System.out.println("Призывники c именем Александр: ");
        nameCompare();

    }

}
