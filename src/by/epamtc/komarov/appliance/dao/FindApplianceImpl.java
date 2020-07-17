package by.epamtc.komarov.appliance.dao;

import by.epamtc.komarov.appliance.bean.ApplianceEnum;
import by.epamtc.komarov.appliance.bean.Oven;

public class FindApplianceImpl implements FindAppliance{

    @Override
    public void printGood(String applianceName, String characteristic){

        ReadFile readFile = new ReadFileImpl();
        String[] good = String.valueOf(readFile.read("App.txt")).split("\n");
        String onlySymbol = "[ _=;:,-]";
        String separate = "([ ;,:][A-Z_ :;,]+)=";

        String[] onlyValue = new String[good.length];

        ApplianceEnum applianceEnum;

        for (int i = 0; i < good.length; i++) {
            onlyValue[i] = good[i].replaceAll(separate, " ").replaceAll(";", "");
            System.out.println(onlyValue[i]);
        }

        String[] array = onlyValue[0].split(" ");

        System.out.println(ApplianceEnum.valueOf(array[0].toUpperCase()));

        if(array[0].equalsIgnoreCase(String.valueOf(ApplianceEnum.valueOf(applianceName.toUpperCase())))){

            if (array[0].equalsIgnoreCase("Oven")){
                Oven oven = new Oven.OvenBuilder()
                        .setPower_consumption(Integer.parseInt(array[1]))
                        .setWeight(Integer.parseInt(array[2]))
                        .setCapacity(Integer.parseInt(array[3]))
                        .setDepth(Integer.parseInt(array[4]))
                        .setHeight(Double.parseDouble(array[5]))
                        .setWidth(Double.parseDouble(array[6]))
                        .ovenBuild();
                System.out.println(oven.getPower_consumption());
                System.out.println(oven.getCapacity());
            }


        }







//        for (String element : good) {
//
//            String compactCharacteristic = characteristic.replaceAll(onlySymbol, " ");
//            String compactLine = element.replaceAll(onlySymbol, " ");
//
//            applianceEnum = ApplianceEnum.valueOf(applianceName.toUpperCase());
//
//            if (compactLine.toUpperCase().contains(String.valueOf(applianceEnum))
//                    && (compactLine.contains(compactCharacteristic.toLowerCase())
//                    || compactLine.contains(compactCharacteristic.toUpperCase()))) {
//
//            }
//        }
    }
}
