package by.epamtc.komarov.file.helper;

import by.epamtc.komarov.file.technic.Technic;

public class Print {

    public static void printGood(String[] array, Technic technic, String characteristic){

        String onlySymbol = "[ _=-]";

        for (String element : array) {

            String compactLine = element.replaceAll(onlySymbol, "");
            String compactWordToLowerCase = characteristic.replaceAll(onlySymbol, "").toLowerCase();
            String compactWordToUpperCase = characteristic.replaceAll(onlySymbol, "").toUpperCase();

            if (compactLine.contains(technic.getName())
                    && (compactLine.contains(compactWordToLowerCase)
                    || compactLine.contains(compactWordToUpperCase))) {

                System.out.println(element);
            }
        }
    }
}
