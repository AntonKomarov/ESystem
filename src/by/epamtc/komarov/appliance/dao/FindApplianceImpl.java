package by.epamtc.komarov.appliance.dao;

import by.epamtc.komarov.appliance.bean.Appliance;

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
}
