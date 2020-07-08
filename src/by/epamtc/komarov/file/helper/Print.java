package by.epamtc.komarov.file.helper;

import by.epamtc.komarov.file.Technic;

public class Print {

    public static void printGood(String[] array, Technic technic, String characteristic){

        String onlySymbol = "[ _=-]";

        for (String element : array) {

            String compactLine = element.replaceAll(onlySymbol, "");
            String compactWord = characteristic.replaceAll(onlySymbol, "").toUpperCase();

            if (compactLine.contains(technic.getName()) && compactLine.contains(compactWord)) {
                System.out.println(element);
            }
        }
    }
}
