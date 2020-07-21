package by.epamtc.komarov.appliance;

import by.epamtc.komarov.appliance.bean.Appliance;
import by.epamtc.komarov.appliance.bean.impl.Oven;
import by.epamtc.komarov.appliance.service.CreateAppliance;
import by.epamtc.komarov.appliance.service.CreateApplianceImpl;

import java.util.ArrayList;
import java.util.List;

public class Runner {

     public static void main(String[] args) {
         Appliance appliance = new Appliance();
         CreateAppliance technic = new CreateApplianceImpl();

         technic.create(appliance,"Oven", "capacity 33");
         technic.create(appliance,"refrigerator", "weight 35");
         technic.create(appliance,"laptop", "memory rom 8000");
         technic.create(appliance,"vacuumcleaner", "BAG_TYPE=XX00");
         technic.create(appliance,"TabletPC", "DISPLAY_INCHES=16");
         technic.create(appliance,"Speakers", "FREQUENCY_RANGE=3-4");

         appliance.print();
    }
}
