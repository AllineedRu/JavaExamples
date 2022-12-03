package ru.allineed.samples.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderWithLines {
    public void readFile(String pathToFile) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile));
            bufferedReader.lines().forEach(System.out::println);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File '" + pathToFile + "' was not found! It must be present on the disk to run the sample.", e);
        }
    }
}
