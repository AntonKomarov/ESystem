package by.epamtc.komarov.appliance.dao;

import by.epamtc.komarov.appliance.bean.Appliance;

import java.util.List;

public interface FindAppliance {
    public List<Appliance> findApplianceByCategory(String[] array, String characteristic);
}
