package com.military.profile;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MilitaryOffice {
    String nameObj;
    int ageObj;
    String sexObj;
    String countryObj;
    String cityObj;
    int numberPerson;

    Scanner scanner = new Scanner(System.in);


    private void numberPerson() {
        System.out.println("Введите число призывников: ");
        this.numberPerson = scanner.nextInt();
    }

    private void nameEnter() {
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

    private void sexEnter() {
        System.out.println("Введите Пол: ");
        this.sexObj = scanner.nextLine();
        while (!this.sexObj.matches("[a-zA-Z]+")) {
            this.sexObj = scanner.nextLine();
        }
    }

    private void cityEnter() {
        System.out.println("Введите Город: ");
        this.cityObj = scanner.nextLine();
    }

    private void countryEnter() {
        System.out.println("Введите Страну: ");
        this.cityObj = scanner.nextLine();
    }


    public void fillInfo() {
        numberPerson();
        IntStream.range(0, numberPerson).forEach(i -> {
            nameEnter();
            ageEnter();
            sexEnter();
            cityEnter();
            countryEnter();
        });


    }


    Person personRegistry = new Person(this.nameObj, this.ageObj, this.sexObj, this.cityObj, this.countryObj);

    public void accept() {

    }

}
