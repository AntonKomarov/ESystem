package by.epamtc.komarov.client_server.dao.impl;

import by.epamtc.komarov.client_server.dao.ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileImpl implements ReadFile {

    public String read()  {

        StringBuilder file = new StringBuilder();
        // don't write "src" in the text place? change it.
        String fileName = "src/by/epamtc/komarov/client_server/resources/file.txt";

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
