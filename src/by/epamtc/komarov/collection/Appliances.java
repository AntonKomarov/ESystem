package by.epamtc.komarov.collection;

import java.io.*;
import java.util.Date;

public class Appliances {
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
//            foundination(array, new Oven(), "height 40");
//            foundination(array, new Laptop(), "memoryrom 8000");

            Date d3 = new Date();
            System.out.println(d3.getTime() - d.getTime());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }


    public static void foundination(String[] array, App app, String line){

        for (int i = 0; i < array.length; i++) {

            String element = array[i].replaceAll("[ _=]", "");
            String right = line.replaceAll("[ _=]", "").toUpperCase();

            if (element.contains(app.getName())) {
                if (element.contains(right)) {
                    System.out.println(array[i]);
                }
            }
        }

    }
}
