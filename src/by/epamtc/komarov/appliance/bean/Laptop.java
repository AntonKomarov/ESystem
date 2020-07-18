package by.epamtc.komarov.appliance.bean;

public class Laptop implements Appliance{

    private double battery_capacity;
    private String operation_system;
    private int memory_rom;
    private int system_memory;
    private double cpu;
    private int display_inchs;

    // equals, hashCode, toString


    public Laptop(){
    }
    public double getBattery_capacity() {
        return battery_capacity;
    }

    public int getMemory_rom() {
        return memory_rom;
    }

    public int getSystem_memory() {
        return system_memory;
    }

    public int getDisplay_inchs() {
        return display_inchs;
    }

    public double getCpu() {
        return cpu;
    }

    public String getOperation_system() {
        return operation_system;
    }

    public static class LaptopBuilder{

        Laptop laptop;
        public LaptopBuilder(){
            laptop = new Laptop();
        }

        public LaptopBuilder setBattery_capacity(double battery_capacity) {
             laptop.battery_capacity = battery_capacity;
             return this;
        }


        public LaptopBuilder setMemory_rom(int memory_rom) {
            laptop.memory_rom = memory_rom;
            return this;
        }


        public LaptopBuilder setSystem_memory(int system_memory) {
            laptop.memory_rom = system_memory;
            return this;
        }


        public LaptopBuilder setDisplay_inchs(int display_inchs) {
            laptop.display_inchs = display_inchs;
            return this;
        }


        public LaptopBuilder setCpu(double cpu) {
            laptop.cpu = cpu;
            return this;
        }


        public LaptopBuilder setOperation_system(String operation_system) {
            laptop.operation_system = operation_system;
            return this;
        }

        public Laptop buildLaptop(){
            return laptop;
        }
    }
}
