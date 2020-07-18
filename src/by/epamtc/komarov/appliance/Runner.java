package by.epamtc.komarov.appliance;

import by.epamtc.komarov.appliance.bean.Appliance;
import by.epamtc.komarov.appliance.bean.ApplianceEnum;
import by.epamtc.komarov.appliance.bean.ApplianceFactory;
import by.epamtc.komarov.appliance.bean.Oven;
import by.epamtc.komarov.appliance.dao.FindAppliance;
import by.epamtc.komarov.appliance.dao.FindApplianceImpl;

public class Runner {

     public static void main(String[] args) {
         FindAppliance findAppliance = new FindApplianceImpl();


        findAppliance.printGood("Oven", "height 40");
//        findAppliance.printGood("Oven", "height 45");
//        findAppliance.printGood("laptop", "memory rom 8000");
//        Print.printGood(new Speakers(), "FREQUENCY RANGE = 2-4");
//        Print.printGood(new TabletPC(), "Red");
//        Print.printGood(new Refrigerator(), "WEIGHT 30");
//        findAppliance.printGood("VacuumCleaner", "POWER_CONSUMPTION=100");

    }
}
