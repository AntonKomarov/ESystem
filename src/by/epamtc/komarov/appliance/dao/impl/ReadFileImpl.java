package by.epamtc.komarov.appliance.dao.impl;

import by.epamtc.komarov.appliance.dao.ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileImpl implements ReadFile {

    @Override
    public StringBuilder readToStringBuilder(String fileName) {

        StringBuilder file = new StringBuilder();

        try(BufferedReader reader = new BufferedReader(new FileReader("appliance.txt"))) {

            String line = reader.readLine();

            while (line != null) {
                file.append(line).append("\n");
                line = reader.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return file;
    }
}
