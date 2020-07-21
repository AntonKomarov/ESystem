package by.epamtc.komarov.appliance.bean.impl;

import by.epamtc.komarov.appliance.bean.Appliance;

import java.util.Objects;

public class VacuumCleaner extends Appliance {

    private int power_consumption;
    private String filter_type;
    private String bag_type;
    private String wand_type;
    private int motor_speed_regulation;
    private int cleaning_width;

    public VacuumCleaner(){

    }

    public int getPower_consumption() {
        return power_consumption;
    }

    public String getFilter_type() {
        return filter_type;
    }

    public String getBag_type() {
        return bag_type;
    }

    public String getWand_type() {
        return wand_type;
    }

    public int getMotor_speed_regulation() {
        return motor_speed_regulation;
    }

    public int getCleaning_width() {
        return cleaning_width;
    }

    @Override
    public String toString() {
        return "VacuumCleaner : " +
                "power_consumption=" + power_consumption +
                ", filter_type=" + filter_type +
                ", bag_type='" + bag_type + '\'' +
                ", wand_type='" + wand_type + '\'' +
                ", motor_speed_regulation=" + motor_speed_regulation +
                ", cleaning_width=" + cleaning_width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return power_consumption == that.power_consumption &&
                motor_speed_regulation == that.motor_speed_regulation &&
                cleaning_width == that.cleaning_width &&
                filter_type.equals(that.filter_type) &&
                bag_type.equals(that.bag_type) &&
                wand_type.equals(that.wand_type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power_consumption, filter_type, bag_type, wand_type, motor_speed_regulation, cleaning_width);
    }

    public static class VacuumCleanerBuilder{
        VacuumCleaner vacuumCleaner;

        public VacuumCleanerBuilder(){
            vacuumCleaner = new VacuumCleaner();
        }


        public VacuumCleanerBuilder setPower_consumption(int power_consumption) {
            vacuumCleaner.power_consumption = power_consumption;
            return this;
        }

        public VacuumCleanerBuilder setFilter_type(String filter_type) {
            vacuumCleaner.filter_type = filter_type;
            return this;

        }

        public VacuumCleanerBuilder setBag_type(String bag_type) {
            vacuumCleaner.bag_type = bag_type;
            return this;

        }

        public VacuumCleanerBuilder setWand_type(String wand_type) {
            vacuumCleaner.wand_type = wand_type;
            return this;

        }

        public VacuumCleanerBuilder setMotor_speed_regulation(int motor_speed_regulation) {
            vacuumCleaner.motor_speed_regulation = motor_speed_regulation;
            return this;

        }

        public VacuumCleanerBuilder setCleaning_width(int cleaning_width) {
            vacuumCleaner.cleaning_width = cleaning_width;
            return this;

        }

        public VacuumCleaner vacuumCleanerBuild(){
            return vacuumCleaner;
        }

    }
}
