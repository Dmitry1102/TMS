package com.home.model;

import java.util.Random;
import java.util.Scanner;


public class Computer {

    String processor;
    String operativeMemory;
    String hardDrive;
    int resourceActivity;
    int enteredNum;
    int rand;
    boolean flag;

    public Computer(String processor, String operativeMemory, String hardDrive, int resourceActivity) {
        this.processor = processor;
        this.operativeMemory = operativeMemory;
        this.hardDrive = hardDrive;
        this.resourceActivity = resourceActivity;
    }

    public void printResult() {
        System.out.println("processor: " + processor);
        System.out.println("operative memory: " + operativeMemory);
        System.out.println("hard drive disk: " + hardDrive);
        System.out.println("resource activity : " + resourceActivity);

    }

    public void on() {
        if (!flag) {
            inputStatement();
            randomNumbers();
        }
        finalOn();

    }

    public void off() {
        if (!flag) {
            inputStatement();
            randomNumbers();
        }
        finalOff();
    }

    private void finalOff() {
        if (enteredNum == rand || !flag) {
            System.out.println("Конец Работы...");
            on();
        } else {
            System.out.println("Компьютер сгорел!");
        }
    }

    private void finalOn() {
        if (enteredNum == rand || !flag) {
            System.out.println("Конец Работы...");
            off();
        } else {
            System.out.println("Компьютер сгорел!");
        }
    }

    private void inputStatement() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        do {
            do {
                System.out.println("Внимание! Введите 0 или 1");
                while (!scanner.hasNextInt()) {
                    System.out.println("Введите 0 или 1");
                    scanner.next();
                }
                enteredNum = scanner.nextInt();
            } while (enteredNum < 0 || enteredNum > 1);
            count++;
            randomNumbers();
        } while (resourceActivity < count);

    }

    public void randomNumbers() {
        Random random = new Random();
        rand = random.nextInt(2);
        error(rand);
    }


    private void error(int a) {
        if (a > resourceActivity) {
            System.out.println("Компьютер сгорел!");
        }
    }
}