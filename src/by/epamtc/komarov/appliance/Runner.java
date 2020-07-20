package by.epamtc.komarov.appliance;

import by.epamtc.komarov.appliance.bean.Appliance;
import by.epamtc.komarov.appliance.service.CreateAppliance;

import java.util.ArrayList;
import java.util.List;

public class Runner {

     public static void main(String[] args) {
         List<Appliance> technic = new ArrayList<>();

         technic.add(CreateAppliance.create("Oven", "capacity 33"));
         technic.add(CreateAppliance.create("refrigerator", "weight 35"));
         technic.add(CreateAppliance.create("laptop", "memory rom 8000"));
         technic.add(CreateAppliance.create("vacuumcleaner", "BAG_TYPE=XX00"));
         technic.add(CreateAppliance.create("TabletPC", "DISPLAY_INCHES=16"));
         technic.add(CreateAppliance.create("Speakers", "FREQUENCY_RANGE=3-4"));

         for (int i = 0; i < technic.size(); i++) {
             System.out.println(technic.get(i));
         }
    }
}
