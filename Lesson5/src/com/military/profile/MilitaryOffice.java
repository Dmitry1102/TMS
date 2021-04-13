package com.military.profile;

import java.util.Scanner;

public class MilitaryOffice {
    String nameObj;
    int ageObj;
    String sexObj;


    public void fillInfo() {
        Scanner scanner = new Scanner(System.in);
        this.nameObj = scanner.nextLine();
        this.ageObj = scanner.nextInt();
        this.sexObj = scanner.nextLine();
    }


    Person personRegistry = new Person(nameObj, ageObj, sexObj);

}
