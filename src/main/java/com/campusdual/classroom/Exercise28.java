package com.campusdual.classroom;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exercise28 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("noexisto.txt");
    }
}
