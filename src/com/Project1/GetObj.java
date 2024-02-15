package com.Project1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class GetObj {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("my.file");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Course [] courses = (Course []) ois.readObject();
            System.out.println(Arrays.toString(courses));

            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
