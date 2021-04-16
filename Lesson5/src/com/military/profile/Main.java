package com.military.profile;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Info info = new Info();
        info.enterPersons();
        PersonRegistry personRegistry = new PersonRegistry(personList);
        for (var person : personRegistry.getPersonList()) {
            System.out.println(person.getName());
        }
        System.out.println("Призывники города Минска: ");
        info.rightCity();
        System.out.println("Призывники от 25 до 27: ");
        info.ageCompare();
        System.out.println("Призывники c именем Александр: ");
        info.nameCompare();

    }


}
