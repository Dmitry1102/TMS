package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    String processor;
    String operativeMemory;
    String hardDrive;
    int resourceActivity;

    public Computer(String s, String s1, String s2, int i) {
        processor = s;
        operativeMemory = s1;
        hardDrive = s2;
        resourceActivity = i;
    }

    public void printResult(){
        System.out.println("processor: " + processor );
        System.out.println("operative memory: " + operativeMemory );
        System.out.println("hard drive disk: " + hardDrive );
        System.out.println("resource activity : " + resourceActivity );

    }


    public void on() {
        System.out.println("Внимание! Введите 0 или 1");
        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();
        if ((myNumber == 0) || (myNumber == 1)) {
            Random random = new Random();
            int count = 0;
            int number;
            do {
                count++;
                number = random.nextInt(2);
            } while (resourceActivity < count);
            error(number);
            if (number == myNumber) {
                off();
            }
        } else {
            System.out.println("Внимание! Введите 0 или 1");
        }

    }


    private void off() {
        System.out.println("The End Of Work");
        System.exit(0);
    }


    private void error(int a) {
        if (a > resourceActivity) {
            System.out.println("Компьютер сгорел!");
        }
    }
}