package org.mystat.Lebedeva;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//спрятать большой код в interface
public class Facade {
    public static void main(String[] args) throws IOException {
        FileReaderFacade fileReaderFacade = new FileReaderFacade();
        System.out.println(fileReaderFacade.readFile("temp.txt"));
    }
}

class FileReaderFacade {
    String readFile(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        StringBuilder stringBuilder = new StringBuilder();
        int j = 0;
        while ((j = bufferedReader.read()) != -1) {
            stringBuilder.append((char) j);
        }
        return stringBuilder.toString();
    }
}