package by.epamtc.komarov.appliance.bean.impl;

import by.epamtc.komarov.appliance.bean.Appliance;

import java.util.Objects;

public class Oven extends Appliance {
    private int power_consumption;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    public Oven(){}

    public int getPower_consumption() {
        return power_consumption;
    }

    public int getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Oven : " +
                "power_consumption=" + power_consumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return power_consumption == oven.power_consumption &&
                weight == oven.weight &&
                capacity == oven.capacity &&
                depth == oven.depth &&
                Double.compare(oven.height, height) == 0 &&
                Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power_consumption, weight, capacity, depth, height, width);
    }

    public static class OvenBuilder{
        Oven oven;

        public OvenBuilder(){
            oven = new Oven();
        }

        public OvenBuilder setPower_consumption(int power_consumption) {
            oven.power_consumption = power_consumption;
            return this;
        }

        public OvenBuilder setWeight(int weight) {
            oven.weight = weight;
            return this;
        }

        public OvenBuilder setCapacity(int capacity) {
            oven.capacity = capacity;
            return this;
        }

        public OvenBuilder setDepth(int depth) {
            oven.depth = depth;
            return this;
        }

        public OvenBuilder setHeight(double height) {
            oven.height = height;
            return this;
        }

        public OvenBuilder setWidth(double width) {
            oven.width = width;
            return this;
        }

        public Oven ovenBuild(){
            return oven;
        }
    }
}
