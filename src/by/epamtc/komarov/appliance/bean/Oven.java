package by.epamtc.komarov.appliance.bean;

public class Oven implements Appliance{
    private int power_consumption;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    // equals, hashCode, toString

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
