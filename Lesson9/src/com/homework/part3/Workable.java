package com.homework.part3;

import java.io.File;
import java.io.IOException;

public interface Workable {
    final String FILE = "C:\\TMS\\Lesson9\\src\\com\\homework\\part3\\text.txt";


    void outputFile(File file) throws IOException;
}
