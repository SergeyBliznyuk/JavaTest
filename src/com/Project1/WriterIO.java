package com.Project1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WriterIO {

    public static void main(String[] args) {

        String fileName = "text1.txt";

        if (fileExists(fileName)) {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("File does not exist: " + fileName);
        }
    }

    private static boolean fileExists(String fileName) {
        return new java.io.File(fileName).exists();

    }

    public static String readFile() {
        BufferedReader br = null;
        String result = "";
        try {
            br = new BufferedReader(new FileReader("text1.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                result  += line + "\n"; }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;

    }

}
