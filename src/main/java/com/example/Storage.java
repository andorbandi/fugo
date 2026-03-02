package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Storage {

    public static void writeToFile(String content) {
        // Itt kezeljük a hibát, vagy másképp a kivételt, itt nem dobjuk el: //
        try {
            tryWriteToFile(content);
        } catch (IOException e) {
            System.err.println("Hiba! A fájl nem írható!");
            System.err.println("A hiba: " + e.getMessage());
        }
    }

    private static void tryWriteToFile(String content) throws IOException {
        FileWriter fileWriter = new FileWriter("adat.txt");
        fileWriter.write(content);
        fileWriter.close();
    }
}
