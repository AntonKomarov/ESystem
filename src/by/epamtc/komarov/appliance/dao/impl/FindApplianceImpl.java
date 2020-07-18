package by.epamtc.komarov.appliance.dao.impl;

import by.epamtc.komarov.appliance.bean.Appliance;
import by.epamtc.komarov.appliance.bean.ApplianceEnum;
import by.epamtc.komarov.appliance.bean.impl.*;
import by.epamtc.komarov.appliance.dao.FindAppliance;
import by.epamtc.komarov.appliance.dao.ReadFile;

import java.util.ArrayList;
import java.util.List;

public class FindApplianceImpl implements FindAppliance {

////////////////// Разделить программу на части по методам и между Service and DAO

    @Override
    public void printGood(String applianceName, String characteristic) {

        ReadFile readFile = new ReadFileImpl();
        String[] good = String.valueOf(readFile.readToStringBuilder("appliance.txt")).split("\n");

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

                name = element.replaceAll("([ ;,:][A-Z_ :;,]+)=", " ");
            }
        }

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

        } else if (array[0].equalsIgnoreCase("Refrigerator")){

            appliance = new Refrigerator.RefrigeratorBuilder()
                    .setPower_consumption(Integer.parseInt(array[1]))
                    .setWeight(Integer.parseInt(array[2]))
                    .setFreezer_capacity(Integer.parseInt(array[3]))
                    .setOverall_capacity(Integer.parseInt(array[4]))
                    .setHeight(Integer.parseInt(array[5]))
                    .setWidth(Integer.parseInt(array[6]))
                    .refrigeratorBuild();

        } else if (array[0].equalsIgnoreCase("VacuumCleaner")){

            appliance = new VacuumCleaner.VacuumCleanerBuilder()
                    .setPower_consumption(Integer.parseInt(array[1]))
                    .setFilter_type(array[2])
                    .setBag_type(array[3])
                    .setWand_type(array[4])
                    .setMotor_speed_regulation(Integer.parseInt(array[5]))
                    .setCleaning_width(Integer.parseInt(array[6]))
                    .vacuumCleanerBuild();

        } else if (array[0].equalsIgnoreCase("TabletPC")){

            appliance = new TabletPC.TabletPCBuilder()
                    .setBattery_capacity(Integer.parseInt(array[1]))
                    .setDisplay_inches(Integer.parseInt(array[2]))
                    .setMemory_rom(Integer.parseInt(array[3]))
                    .setFlash_memory_capacity(Integer.parseInt(array[4]))
                    .setColor(array[5])
                    .tabletPCBuild();
        } else if (array[0].equalsIgnoreCase("Speakers")){

            appliance = new Speakers.SpeakerBuilder()
                    .setPower_consumption(Integer.parseInt(array[1]))
                    .setNumber_of_speakers(Integer.parseInt(array[2]))
                    .setFrequency_range(array[3])
                    .setCord_length(Integer.parseInt(array[4]))
                    .speakersBuild();
        }

        return appliance;
    }
}

