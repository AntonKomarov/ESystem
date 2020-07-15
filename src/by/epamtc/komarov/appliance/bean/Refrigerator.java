package by.epamtc.komarov.appliance.bean;

public class Refrigerator implements Appliance{

    private int power_consumption;
    private int weight;
    private int freezer_capacity;
    private int overall_capacity;
    private int height;
    private int width;

    // equals, hashCode, toString


    public int getPower_consumption() {
        return power_consumption;
    }

    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFreezer_capacity() {
        return freezer_capacity;
    }

    public void setFreezer_capacity(int freezer_capacity) {
        this.freezer_capacity = freezer_capacity;
    }

    public int getOverall_capacity() {
        return overall_capacity;
    }

    public void setOverall_capacity(int overall_capacity) {
        this.overall_capacity = overall_capacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
