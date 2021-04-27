package com.homework.part4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFormater {
    private final String NAME = "C:\\TMS\\Lesson9\\src\\com\\homework\\part4\\test.txt";
    private File file;


    public String readFile() throws IOException {
        file = new File(NAME);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            return line;
        }
        return line;
    }


    public static int countWords(String str) {
        int count = 0;
        if (str.length() != 0) {
            count++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        return count;

    }

    public static boolean wordsPolindromes(String str) {
        boolean flag = false;
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return flag;
            } else {
                flag = true;
            }
        }
        return flag;

    }


}
