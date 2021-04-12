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
        try {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int myNumber = scanner.nextInt() ;
            int number;
            do {
                number = random.nextInt();
            } while (resourceActivity < number);
            error(number);
            if (number == myNumber) {
                off();
            }

        } catch (Exception e) {
            System.out.println("Внимание! Введите 0 или 1");
        }

    }


    private void off() {

    }


    private void error(int a) {
        if (a > resourceActivity) {
            System.out.println("Компьютер сгорел!");
        }
    }
}