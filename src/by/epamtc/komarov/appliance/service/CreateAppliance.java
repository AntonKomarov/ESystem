package by.epamtc.komarov.appliance.service;

import by.epamtc.komarov.appliance.bean.Appliance;

public interface CreateAppliance {

    public Appliance create(Appliance appliance, String applianceName, String characteristic);

}
