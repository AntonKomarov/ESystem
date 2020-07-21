package by.epamtc.komarov.appliance.bean;

import java.util.ArrayList;
import java.util.List;

public class Appliance {
    private List<Appliance> appliances = new ArrayList<>();


    public List<Appliance> getAppliances() {
        return appliances;
    }

    public void setAppliances(List<Appliance> appliances) {
        this.appliances = appliances;
    }

    public void print(){
        for (Appliance appliance : appliances) {
            System.out.println(appliance);
        }
    }
}
