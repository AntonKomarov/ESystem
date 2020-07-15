package by.epamtc.komarov.appliance.bean;

public class Speakers implements Appliance{

    private int power_consumption;
    private int number_of_speakers;
    private double frequency_range;
    private int cord_length;

    // equals, hashCode, toString


    public int getPower_consumption() {
        return power_consumption;
    }

    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    public int getNumber_of_speakers() {
        return number_of_speakers;
    }

    public void setNumber_of_speakers(int number_of_speakers) {
        this.number_of_speakers = number_of_speakers;
    }

    public double getFrequency_range() {
        return frequency_range;
    }

    public void setFrequency_range(double frequency_range) {
        this.frequency_range = frequency_range;
    }

    public int getCord_length() {
        return cord_length;
    }

    public void setCord_length(int cord_length) {
        this.cord_length = cord_length;
    }
}
