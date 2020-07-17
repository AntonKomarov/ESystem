package by.epamtc.komarov.appliance.bean;

public class Speakers implements Appliance{

    private int power_consumption;
    private int number_of_speakers;
    private double frequency_range;
    private int cord_length;

    // equals, hashCode, toString


    public Speakers(){

    }

    public int getPower_consumption() {
        return power_consumption;
    }

    public int getNumber_of_speakers() {
        return number_of_speakers;
    }

    public double getFrequency_range() {
        return frequency_range;
    }

    public int getCord_length() {
        return cord_length;
    }

    public static class SpeakerBuilder{

        Speakers speakers;

        public SpeakerBuilder(){
            speakers = new Speakers();
        }

        public SpeakerBuilder setPower_consumption(int power_consumption) {
            speakers.power_consumption = power_consumption;
            return this;
        }

        public SpeakerBuilder setNumber_of_speakers(int number_of_speakers) {
            speakers.number_of_speakers = number_of_speakers;
            return this;
        }

        public SpeakerBuilder setFrequency_range(double frequency_range) {
            speakers.frequency_range = frequency_range;
            return this;
        }

        public SpeakerBuilder setCord_length(int cord_length) {
            speakers.cord_length = cord_length;
            return this;
        }

        public Speakers speakersBuild(){
            return speakers;
        }

    }
}
