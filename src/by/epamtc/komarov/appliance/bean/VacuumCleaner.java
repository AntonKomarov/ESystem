package by.epamtc.komarov.appliance.bean;

public class VacuumCleaner implements Appliance{

    private int power_consumption;
    private char filter_type;
    private String bag_type;
    private String wand_type;
    private int motor_speed_regulation;
    private int cleaning_width;

    // equals, hashCode, toString


    public int getPower_consumption() {
        return power_consumption;
    }

    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    public char getFilter_type() {
        return filter_type;
    }

    public void setFilter_type(char filter_type) {
        this.filter_type = filter_type;
    }

    public String getBag_type() {
        return bag_type;
    }

    public void setBag_type(String bag_type) {
        this.bag_type = bag_type;
    }

    public String getWand_type() {
        return wand_type;
    }

    public void setWand_type(String wand_type) {
        this.wand_type = wand_type;
    }

    public int getMotor_speed_regulation() {
        return motor_speed_regulation;
    }

    public void setMotor_speed_regulation(int motor_speed_regulation) {
        this.motor_speed_regulation = motor_speed_regulation;
    }

    public int getCleaning_width() {
        return cleaning_width;
    }

    public void setCleaning_width(int cleaning_width) {
        this.cleaning_width = cleaning_width;
    }
}
