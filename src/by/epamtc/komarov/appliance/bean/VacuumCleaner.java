package by.epamtc.komarov.appliance.bean;

public class VacuumCleaner implements Appliance{

    private int power_consumption;
    private char filter_type;
    private String bag_type;
    private String wand_type;
    private int motor_speed_regulation;
    private int cleaning_width;

    // equals, hashCode, toString

    public VacuumCleaner(){

    }

    public int getPower_consumption() {
        return power_consumption;
    }

    public char getFilter_type() {
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


    public static class VacuumCleanerBuilder{
        VacuumCleaner vacuumCleaner;

        public VacuumCleanerBuilder(){
            vacuumCleaner = new VacuumCleaner();
        }


        public VacuumCleanerBuilder setPower_consumption(int power_consumption) {
            vacuumCleaner.power_consumption = power_consumption;
            return this;
        }

        public VacuumCleanerBuilder setFilter_type(char filter_type) {
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
