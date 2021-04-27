package com.homework.part1;

import java.util.Scanner;

public class Make implements Makeble {
    private Scanner scanner = new Scanner(System.in);


    @Override
    public String cut(String str) {
        int index1 = str.indexOf('a');
        int index2 = str.lastIndexOf('b');
        String substr = str.substring(index1, index2 + 1);
        return substr;
    }
}
