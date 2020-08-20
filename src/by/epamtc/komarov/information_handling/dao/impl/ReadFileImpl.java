package by.epamtc.komarov.information_handling.dao.impl;

import by.epamtc.komarov.information_handling.dao.ReadFile;

import java.io.*;

public class ReadFileImpl implements ReadFile {

    @Override
    public String read()  {

        StringBuilder file = new StringBuilder();
        // don't write "src" in the text place? change it.
        String fileName = "src/by/epamtc/komarov/information_handling/resources/text.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line = reader.readLine();

            while (line != null) {
                file.append(line).append("\n");
                line = reader.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return String.valueOf(file);
    }
}
