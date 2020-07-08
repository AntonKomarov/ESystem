package by.epamtc.komarov.collection;

import java.io.*;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("App.txt"))) {

            Date d = new Date();
            System.out.println(d.getTime());

            StringBuilder fileContains = new StringBuilder();
            String line = bufferedReader.readLine();

            while (line != null) {
                fileContains.append(line).append("\n");
                line = bufferedReader.readLine();
            }

            Date d2 = new Date();
            System.out.println(d2.getTime() - d.getTime());

            String[] containsFileToArray = String.valueOf(fileContains).split("\n");
            foundination(containsFileToArray, new Oven(), "height 40");
            foundination(containsFileToArray, new Laptop(), "memoryrom 8000");

            Date d3 = new Date();
            System.out.println(d3.getTime() - d.getTime());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }


    public static void foundination(String[] array, Technic technic, String characteristic){

        String onlySymbol = "[ _=]";
        for (String element : array) {

            String compactLine = element.replaceAll(onlySymbol, "");
            String compactWord = characteristic.replaceAll(onlySymbol, "").toUpperCase();

            if (compactLine.contains(technic.getName()) && compactLine.contains(compactWord)) {
                    System.out.println(element);
            }
        }
    }
}
