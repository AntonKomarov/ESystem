package by.epamtc.komarov.file.helper;

import by.epamtc.komarov.file.technic.Technic;

public class Print {

    public static void printGood(String[] array, Technic technic, String characteristic){

        String onlySymbol = "[ _=-]";

        for (String element : array) {

            String compactWord = characteristic.replaceAll(onlySymbol, "");
            String compactLine = element.replaceAll(onlySymbol, "");

            if (compactLine.contains(technic.getName())
                    && (compactLine.contains(compactWord.toLowerCase())
                    || compactLine.contains(compactWord.toUpperCase()))) {

                System.out.println(element);
            }
        }
    }
}
