package com.homework.part3;

import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {

        Work work = new Work();
        work.readFile();


        Workable workable = new Work();
        workable.outputFile(work.getFile());


    }
}
