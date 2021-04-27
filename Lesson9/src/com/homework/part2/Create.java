package com.homework.part2;

public class Create implements Createble {


    @Override
    public String create(String str) {
        char posFirst = str.charAt(3);
        char posEnd = str.charAt(0);
        str = str.replace(posFirst, posEnd);
        return str;
    }
}
