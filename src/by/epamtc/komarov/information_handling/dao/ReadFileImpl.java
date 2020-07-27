package by.epamtc.komarov.information_handling.dao;

import java.io.*;

public class ReadFileImpl implements ReadFile{

    public static void createFile(){
        File writer = new File("src/by/epamtc/komarov/information_handling/text.txt");
    }

    @Override
    public StringBuilder readToStringBuilder(String fileName)  {


        StringBuilder file = new StringBuilder();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

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
