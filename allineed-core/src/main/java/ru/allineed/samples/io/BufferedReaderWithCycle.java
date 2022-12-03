package ru.allineed.samples.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderWithCycle {
    public void readFile(String pathToFile) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile));
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException("File '" + pathToFile + "' was not found! It must be present on the disk to run the sample.", e);
        }
    }
}
