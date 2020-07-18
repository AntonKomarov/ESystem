package by.epamtc.komarov.appliance.dao;

import by.epamtc.komarov.appliance.bean.Appliance;
import by.epamtc.komarov.appliance.bean.ApplianceEnum;
import by.epamtc.komarov.appliance.bean.Laptop;
import by.epamtc.komarov.appliance.bean.Oven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindApplianceImpl implements FindAppliance {

    @Override
    public void printGood(String applianceName, String characteristic) {

        ReadFile readFile = new ReadFileImpl();
        String[] good = String.valueOf(readFile.read("App.txt")).split("\n");

        String onlySymbol = "[ _=;:,-]";
        String name = null;
        String compactCharacteristic = null;
        String compactLine = null;

        for (String element : good) {

            compactCharacteristic = characteristic.replaceAll(onlySymbol, " ");
            compactLine = element.replaceAll(onlySymbol, " ");

            if (compactLine.toUpperCase().contains(String.valueOf(ApplianceEnum.valueOf(applianceName.toUpperCase())))
                    && (compactLine.contains(compactCharacteristic.toLowerCase())
                    || compactLine.contains(compactCharacteristic.toUpperCase()))) {

                System.out.println(element);
                name = element.replaceAll("([ ;,:][A-Z_ :;,]+)=", " ");
            }
        }
        System.out.println(name);

        List<Appliance> appliances = new ArrayList<>();
        appliances.add(getAppliance(name));
        System.out.println(appliances);
    }

    public static String[] getParameters(String line){
        return line.replaceAll(";", "").split(" ");
    }


    public static Appliance getAppliance(String lineName){
        Appliance appliance = null;

        String[] array = getParameters(lineName);

        if (array[0].equalsIgnoreCase("Oven")) {

            appliance = new Oven.OvenBuilder()
                    .setPower_consumption(Integer.parseInt(array[1]))
                    .setWeight(Integer.parseInt(array[2]))
                    .setCapacity(Integer.parseInt(array[3]))
                    .setDepth(Integer.parseInt(array[4]))
                    .setHeight(Double.parseDouble(array[5]))
                    .setWidth(Double.parseDouble(array[6]))
                    .ovenBuild();

        } else if (array[0].equalsIgnoreCase("Laptop")) {

            appliance = new Laptop.LaptopBuilder()
                    .setBattery_capacity(Double.parseDouble(array[1]))
                    .setOperation_system(array[2])
                    .setMemory_rom(Integer.parseInt(array[3]))
                    .setSystem_memory(Integer.parseInt(array[4]))
                    .setCpu(Double.parseDouble(array[5]))
                    .setDisplay_inchs(Integer.parseInt(array[6]))
                    .buildLaptop();
        }

        return appliance;
    }
}
