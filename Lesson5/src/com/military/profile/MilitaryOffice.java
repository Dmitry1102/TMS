package com.military.profile;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MilitaryOffice {
    public String nameObj;
    public int ageObj;
    public String sexObj;
    public String cityObj;
    public String countryObj;
    public int numberPerson;
    public static final String COUNTRY = "Беларусь";
    public static final String CITY = "Минск";
    public static final String NAME = "Александр";
    public static final String MAN = "Мужчина";

    Scanner scanner = new Scanner(System.in);
    ArrayList<Person> persons = new ArrayList<Person>();

    private void numberPerson() {
        System.out.println("Введите число призывников: ");
        this.numberPerson = scanner.nextInt();
    }

    private void nameEnter() {
        System.out.println("Введите Имя: ");
        this.nameObj = scanner.nextLine();
        while (!this.nameObj.matches("[а-яА-Я]+")) {
            this.nameObj = scanner.nextLine();
        }
    }

    private void ageEnter() {
        System.out.println("Введите Возраст: ");
        while (scanner.hasNextInt()) {
            this.ageObj = scanner.nextInt();
            break;
        }

    }

    private void sexEnter() {
        System.out.println("Введите Пол: ");
        sexObj = scanner.nextLine();
        while (!this.sexObj.matches("[а-яА-Я]+")) {
            this.sexObj = scanner.nextLine();
        }
    }

    private void cityEnter() {
        System.out.println("Введите Город: ");
        this.cityObj = scanner.nextLine();
        while (!this.cityObj.matches("[а-яА-Я]+")) {
            this.cityObj = scanner.nextLine();
        }
    }

    private void countryEnter() {
        System.out.println("Введите Страну: ");
        this.countryObj = scanner.nextLine();
        while (!this.countryObj.matches("[а-яА-Я]+")) {
            this.countryObj = scanner.nextLine();
        }
    }

    private void printList() {
        System.out.print("имя: " + this.nameObj + " возраст: " + this.ageObj + " пол: " + this.sexObj + " страна: " + this.countryObj + " город: " + this.cityObj);
        System.out.println();

    }


    public void check() {
        Person personRegistry = new Person(this.nameObj, this.ageObj, this.sexObj, this.cityObj, this.countryObj);
        for (int i = 0; i < numberPerson; i++) {
            if (countryObj.equals(COUNTRY)) {
                if (sexObj.equals(MAN)) {
                    if (ageObj > 18 && ageObj < 28) {
                        persons.add(personRegistry);
                    } else {
                        System.out.println("Не проходит до призыва по возрасту...");
                        break;
                    }
                } else {
                    System.out.println("Женшины не являются военнообязаными...");
                    break;
                }
            } else {
                System.out.println("Гражданин Другого Государства...");
                break;
            }
        }


    }

    public void fillInfo() {
        numberPerson();
        IntStream.range(0, numberPerson).forEach(i -> {
            nameEnter();
            ageEnter();
            sexEnter();
            cityEnter();
            countryEnter();
            check();
            System.out.println();
        });
        System.out.println("Граждане Минска: ");
        personsMinsk();
        System.out.println();
        System.out.println("Граждане cтарше 25: ");
        lastPeriodPerson();
        System.out.println();
        System.out.println("Граждане c именем Александр: ");
        namedPerson();

    }

    public void personsMinsk() {
        Person personRegistry = new Person(this.nameObj, this.ageObj, this.sexObj, this.cityObj, this.countryObj);
        if (personRegistry.getAdress().getCity().equals(CITY)) {
            System.out.println(persons);
        }
    }

    public void lastPeriodPerson() {
        Person personRegistry = new Person(this.nameObj, this.ageObj, this.sexObj, this.cityObj, this.countryObj);
        if (personRegistry.getAge() >= 25) {
            System.out.println(persons);
        }
    }

    Adress adress;

    public void namedPerson() {
        Person personRegistry = new Person(this.nameObj, this.ageObj, this.sexObj, this.cityObj, this.countryObj);
        if (personRegistry.getName().equals(NAME)) {
            System.out.println(persons);
        }

    }


}
