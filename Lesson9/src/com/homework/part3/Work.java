package com.homework.part3;

import java.io.*;

public class Work implements Workable {
    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void readFile() throws IOException {
        file = new File(FILE);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        System.out.println();
    }

    private boolean isPalindrom(char[] charArray) {
        int index1 = 0;
        int index2 = charArray.length - 1;
        while (index2 > index1) {
            if (charArray[index1] != charArray[index2]) {
                return false;
            }
            index1++;
            index2--;
        }
        return true;
    }

    private void addFile(String str, FileWriter fileWriter) {
        try {
            fileWriter.write(str + "\n");
        } catch (IOException e) {
            System.out.println("Not written to file:");
        } catch (Exception e) {
            System.out.println("File not found:");
        }
    }


    @Override
    public void outputFile(File file) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        FileWriter fileWriter = new FileWriter("output.txt");
        while ((line = reader.readLine()) != null) {
            char[] chars = line.toCharArray();
            if (isPalindrom(chars)) {
                addFile(line, fileWriter);
            }
        }
        fileWriter.close();
    }
}
