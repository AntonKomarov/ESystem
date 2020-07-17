package by.epamtc.komarov.appliance.bean;

public class TabletPC implements Appliance{

    private int battery_capacity;
    private int display_inches;
    private int memory_rom;
    private int flash_memory_capacity;
    private String color;

    // equals, hashCode, toString

    public TabletPC(){

    }


    public int getBattery_capacity() {
        return battery_capacity;
    }

    public void setBattery_capacity(int battery_capacity) {
        this.battery_capacity = battery_capacity;
    }

    public int getDisplay_inches() {
        return display_inches;
    }

    public void setDisplay_inches(int display_inches) {
        this.display_inches = display_inches;
    }

    public int getMemory_rom() {
        return memory_rom;
    }

    public void setMemory_rom(int memory_rom) {
        this.memory_rom = memory_rom;
    }

    public int getFlash_memory_capacity() {
        return flash_memory_capacity;
    }

    public void setFlash_memory_capacity(int flash_memory_capacity) {
        this.flash_memory_capacity = flash_memory_capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public static class TabletPCBuilder {
        TabletPC tabletPC;

        public TabletPCBuilder(){
            tabletPC = new TabletPC();
        }

        public TabletPCBuilder setBattery_capacity(int battery_capacity) {
            tabletPC.battery_capacity = battery_capacity;
            return this;
        }

        public TabletPCBuilder setDisplay_inches(int display_inches) {
            tabletPC.display_inches = display_inches;
            return this;
        }

        public TabletPCBuilder setMemory_rom(int memory_rom) {
            tabletPC.memory_rom = memory_rom;
            return this;
        }

        public TabletPCBuilder setFlash_memory_capacity(int flash_memory_capacity) {
            tabletPC.flash_memory_capacity = flash_memory_capacity;
            return this;
        }

        public TabletPCBuilder setColor(String color) {
            tabletPC.color = color;
            return this;
        }

        public TabletPC tabletPCBuild(){
            return tabletPC;
        }
    }
}
