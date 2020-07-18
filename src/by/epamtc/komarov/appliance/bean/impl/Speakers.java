package by.epamtc.komarov.appliance.bean.impl;

import by.epamtc.komarov.appliance.bean.Appliance;

import java.util.Objects;

public class Speakers implements Appliance {

    private int power_consumption;
    private int number_of_speakers;
    private String frequency_range;
    private int cord_length;

    public Speakers(){

    }

    public int getPower_consumption() {
        return power_consumption;
    }

    public int getNumber_of_speakers() {
        return number_of_speakers;
    }

    public String getFrequency_range() {
        return frequency_range;
    }

    public int getCord_length() {
        return cord_length;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "power_consumption=" + power_consumption +
                ", number_of_speakers=" + number_of_speakers +
                ", frequency_range=" + frequency_range +
                ", cord_length=" + cord_length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return power_consumption == speakers.power_consumption &&
                number_of_speakers == speakers.number_of_speakers &&
                cord_length == speakers.cord_length &&
                frequency_range.equals(speakers.frequency_range);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power_consumption, number_of_speakers, frequency_range, cord_length);
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

        public SpeakerBuilder setFrequency_range(String frequency_range) {
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
