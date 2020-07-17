package by.epamtc.komarov.appliance.dao;

import by.epamtc.komarov.appliance.bean.Appliance;
import by.epamtc.komarov.file.helper.ReadFile;
import by.epamtc.komarov.file.technic.ApplianceEnum;

import java.util.ArrayList;
import java.util.List;

public class FindApplianceImpl implements FindAppliance{

    @Override
    public List<Appliance> findApplianceByCategory(String[] array, String characteristic) {

            String onlySymbol = "[ _=-]";

            for (String element : array) {

                String compactWord = characteristic.replaceAll(onlySymbol, "");
                String compactLine = element.replaceAll(onlySymbol, "");

                // вместо technic
//                if (compactLine.contains(technic.getName())
//                        && (compactLine.contains(compactWord.toLowerCase())
//                        || compactLine.contains(compactWord.toUpperCase()))) {
//
//                    System.out.println(element);
//                }
            }
            return null;
    }




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
