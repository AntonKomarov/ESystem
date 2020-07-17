package by.epamtc.komarov.file.helper;

import by.epamtc.komarov.file.technic.ApplianceEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Print {

     public static void printGood(String applianceName, String characteristic){

        String[] good = String.valueOf(ReadFile.toStringBuilder("App.txt")).split("\n");

        String onlySymbol = "[ _=-]";

        ApplianceEnum applianceEnum;
        List<String> value = new ArrayList<>();

        StringBuilder stringBuilder;
        for (String element : good) {

            String compactCharacteristic = characteristic.replaceAll(onlySymbol, "");
            String compactLine = element.replaceAll(onlySymbol, "");


            applianceEnum = ApplianceEnum.valueOf(applianceName.toUpperCase());

            if (compactLine.toUpperCase().contains(String.valueOf(applianceEnum))
                    && (compactLine.contains(compactCharacteristic.toLowerCase())
                    || compactLine.contains(compactCharacteristic.toUpperCase()))) {

                System.out.println(element);
                

            }
        }





    }
}
