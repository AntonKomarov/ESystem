package by.epamtc.komarov.appliance.bean;

public class Laptop implements Appliance{

    private int battery_capacity;
    private String operation_system;
    private int memory_rom;
    private int system_memory;
    private double cpu;
    private int display_inchs;

    // equals, hashCode, toString


    public int getBattery_capacity() {
        return battery_capacity;
    }

    public void setBattery_capacity(int battery_capacity) {
        this.battery_capacity = battery_capacity;
    }

    public int getMemory_rom() {
        return memory_rom;
    }

    public void setMemory_rom(int memory_rom) {
        this.memory_rom = memory_rom;
    }

    public int getSystem_memory() {
        return system_memory;
    }

    public void setSystem_memory(int system_memory) {
        this.system_memory = system_memory;
    }

    public int getDisplay_inchs() {
        return display_inchs;
    }

    public void setDisplay_inchs(int display_inchs) {
        this.display_inchs = display_inchs;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public String getOperation_system() {
        return operation_system;
    }

    public void setOperation_system(String operation_system) {
        this.operation_system = operation_system;
    }
}
