package com.military.profile;

import java.util.Scanner;

public class Info {
    private final Scanner scanner = new Scanner(System.in);

    private int getEnterPersonNumbers() {
        System.out.println("Введите количество: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private void enterName(Person person) {
        System.out.println("Введите имя: ");
        person.setName(scanner.nextLine());
    }

    private void enterAge(Person person) {
        System.out.println("Введите возрвст: ");
        person.setAge(Integer.parseInt(scanner.nextLine()));
    }

//    private void enterSex() {
//        System.out.println("Введите пол: ");
//        person.setSex(scanner.nextLine());
//    }
//
//    private void enterCity() {
//        System.out.println("Введите город: ");
//        adress.setCity(scanner.nextLine());
//    }
//
//    private void enterCountry() {
//        System.out.println("Введите страну: ");
//        adress.setCountry(scanner.nextLine());
//    }

    public List<Person> getPreparePersons() {
        List<Person> personList = new ArrayList<>();
        int personNumbers = getEnterPersonNumbers();
        for (int i = 0; i < personNumbers; i++) {
            Person person = new Person();
            enterName(person);
            enterAge(person);
            personList.add(person);
            //дальше доделайте логику
//            enterCity();
//            enterCountry();
        }
        return personList;
    }

}
}
