package by.epamtc.komarov.appliance.bean;

public class Refrigerator implements Appliance{

    private int power_consumption;
    private int weight;
    private int freezer_capacity;
    private int overall_capacity;
    private int height;
    private int width;

    // equals, hashCode, toString

    public Refrigerator(){

    }


    public int getPower_consumption() {
        return power_consumption;
    }

    public int getWeight() {
        return weight;
    }

    public int getFreezer_capacity() {
        return freezer_capacity;
    }

    public int getOverall_capacity() {
        return overall_capacity;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }


    public static class RefrigeratorBuilder {
        Refrigerator refrigerator;

        public RefrigeratorBuilder(){
            refrigerator = new Refrigerator();
        }

        public RefrigeratorBuilder setPower_consumption(int power_consumption) {
            refrigerator.power_consumption = power_consumption;
            return this;
        }

        public RefrigeratorBuilder setWeight(int weight) {
            refrigerator.weight = weight;
            return this;
        }

        public RefrigeratorBuilder setFreezer_capacity(int freezer_capacity) {
            refrigerator.freezer_capacity = freezer_capacity;
            return this;
        }

        public RefrigeratorBuilder setOverall_capacity(int overall_capacity) {
            refrigerator.overall_capacity = overall_capacity;
            return this;
        }

        public RefrigeratorBuilder setHeight(int height) {
            refrigerator.height = height;
            return this;
        }

        public RefrigeratorBuilder setWidth(int width) {
            refrigerator.weight = width;
            return this;
        }

        public Refrigerator refrigeratorBuild(){
            return refrigerator;
        }
    }
}
