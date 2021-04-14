package com.military.profile;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MilitaryOffice {
    public String nameObj;
    public int ageObj;
    public String sexObj;
    public String countryObj;
    public String cityObj;
    public int numberPerson;

    Scanner scanner = new Scanner(System.in);
    Person personRegistry = new Person(this.nameObj, this.ageObj, this.sexObj, this.countryObj, this.cityObj);
    Person[] person = new Person[numberPerson];

    public void numberPerson() {
        System.out.println("Введите число призывников: ");
        this.numberPerson = scanner.nextInt();
    }

    public void nameEnter() {
        System.out.println("Введите Имя: ");
        this.nameObj = scanner.nextLine();
        while (!this.nameObj.matches("[a-zA-Z]+")) {
            this.nameObj = scanner.nextLine();
        }
    }

    public void ageEnter() {
        System.out.println("Введите Возраст: ");
        while (scanner.hasNextInt()) {
            this.ageObj = scanner.nextInt();
            break;
        }

    }

    public void sexEnter() {
        System.out.println("Введите Пол: ");
        sexObj = scanner.nextLine();
        while (!this.sexObj.matches("[a-zA-Z]+")) {
            this.sexObj = scanner.nextLine();
        }
    }

    public void cityEnter() {
        System.out.println("Введите Город: ");
        this.cityObj = scanner.nextLine();
    }

    public void countryEnter() {
        System.out.println("Введите Страну: ");
        this.countryObj = scanner.nextLine();

    }

    public void printList() {
        System.out.print("name: " + this.nameObj + " age: " + this.ageObj + " sex: " + this.sexObj + " country: " + this.countryObj + " city: " + this.cityObj);
        System.out.println();

    }


    public void fillInfo() {
        numberPerson();
        IntStream.range(0, numberPerson).forEach(i -> {
            nameEnter();
            ageEnter();
            sexEnter();
            cityEnter();
            countryEnter();
            printList();
            System.out.println();
        });


    }



}
