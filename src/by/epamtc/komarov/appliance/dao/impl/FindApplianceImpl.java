package by.epamtc.komarov.appliance.dao.impl;

import by.epamtc.komarov.appliance.bean.ApplianceEnum;
import by.epamtc.komarov.appliance.dao.FindAppliance;
import by.epamtc.komarov.appliance.dao.ReadFile;

public class FindApplianceImpl implements FindAppliance {

    @Override
    public String findAppliance(String applianceName, String characteristic) {

        ReadFile readFile = new ReadFileImpl();
        String[] good = String.valueOf(readFile.readToStringBuilder("appliance.txt")).split("\n");

        String onlySymbol = "[ _=;:,-]";
        String line = null;
        String compactCharacteristic;
        String compactLine;

        for (String element : good) {

            compactCharacteristic = characteristic.replaceAll(onlySymbol, " ");
            compactLine = element.replaceAll(onlySymbol, " ");

            if (compactLine.toUpperCase().contains(String.valueOf(ApplianceEnum.valueOf(applianceName.toUpperCase())))
                    && (compactLine.contains(compactCharacteristic.toLowerCase())
                    || compactLine.contains(compactCharacteristic.toUpperCase()))) {

                line = element.replaceAll("([ ;,:][A-Z_ :;,]+)=", " ");
            }
        }
        return line;
    }
}

