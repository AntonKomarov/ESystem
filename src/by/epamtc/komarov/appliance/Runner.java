package by.epamtc.komarov.appliance;

import by.epamtc.komarov.appliance.dao.FindAppliance;
import by.epamtc.komarov.appliance.dao.impl.FindApplianceImpl;

public class Runner {

     public static void main(String[] args) {
         FindAppliance findAppliance = new FindApplianceImpl();


        findAppliance.printGood("Oven", "height 40");
        findAppliance.printGood("Oven", "height 45");
        findAppliance.printGood("laptop", "memory rom 8000");
        findAppliance.printGood("speakers", "FREQUENCY RANGE=2-4");
        findAppliance.printGood("tabletpc", "Red");
        findAppliance.printGood("refrigerator", "WEIGHT 30");
        findAppliance.printGood("VacuumCleaner", "POWER_CONSUMPTION=100");

    }
}
