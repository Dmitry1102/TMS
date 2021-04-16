package com.military.profile;

import java.util.Scanner;

public class Info {
    Scanner scanner = new Scanner(System.in);
    private int numberPersons;
    Person person;
    Adress adress;
    PersonRegestry personRegestry;


    public Info(int numberPersons) {
        this.numberPersons = numberPersons;
    }

    public int getNumberPersons() {
        return numberPersons;
    }

    public void setNumberPersons(int numberPersons) {
        this.numberPersons = numberPersons;
    }

    private void enterNumber() {
        System.out.println("Введите количество: ");
        setNumberPersons(scanner.nextInt());
    }

    private void enterName() {
        System.out.println("Введите имя: ");
        person.setName(scanner.nextLine());
    }

    private void enterAge() {
        System.out.println("Введите возрвст: ");
        person.setAge(scanner.nextInt());
    }

    private void enterSex() {
        System.out.println("Введите пол: ");
        person.setSex(scanner.nextLine());
    }

    private void enterCity() {
        System.out.println("Введите город: ");
        adress.setCity(scanner.nextLine());
    }

    private void enterCountry() {
        System.out.println("Введите страну: ");
        adress.setCountry(scanner.nextLine());
    }

    public void fillInfo() {
        enterNumber();
        enterName();
        enterAge();
        enterCity();
        enterCountry();


    }
}
