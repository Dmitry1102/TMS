package com.homework.part2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the String:");
        String str = scanner.nextLine();

        Createble createble = new Create();
        System.out.println(createble.create(str));

    }
}
