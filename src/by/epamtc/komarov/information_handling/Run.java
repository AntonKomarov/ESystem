package by.epamtc.komarov.information_handling;

import by.epamtc.komarov.information_handling.dao.ReadFile;
import by.epamtc.komarov.information_handling.dao.ReadFileImpl;


import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {

        ReadFile readFile = new ReadFileImpl();

        // не хардкодить путь через src
        String[] array = String.valueOf(readFile.
                readToStringBuilder("src/by/epamtc/komarov/information_handling/resources/text.txt")).split("\n");

        for (String line : array) {
            System.out.println(line);

        }
    }
}
