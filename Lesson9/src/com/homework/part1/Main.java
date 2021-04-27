package com.homework.part1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String testString = scanner.nextLine();
        System.out.println(testString);

        Makeble cut = new Make();
        try {
            System.out.println(cut.cut(testString));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

}
