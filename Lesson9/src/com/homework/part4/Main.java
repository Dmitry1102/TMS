package com.homework.part4;

import java.io.FileWriter;
import java.io.IOException;

import static com.homework.part4.TextFormater.countWords;
import static com.homework.part4.TextFormater.wordsPolindromes;

public class Main {
    public static void main(String[] args) throws IOException {

        TextFormater formater = new TextFormater();
        String text = formater.readFile();
        System.out.println(text);
        String[] sentence = text.split("\\.");
        System.out.println();


        FileWriter fileWriter = new FileWriter("final.txt");

        for (int i = 0; i < sentence.length; i++) {
            boolean flag = wordsPolindromes(sentence[i]);
            if ((countWords(sentence[i]) >= 3) && (countWords(sentence[i]) <= 5)) {
                fileWriter.write(sentence[i] + "\n");
            } else if (flag) {
                fileWriter.write(sentence[i] + "\n");
            }


        }
        fileWriter.close();

    }
}
