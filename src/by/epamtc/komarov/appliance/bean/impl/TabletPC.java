package by.epamtc.komarov.appliance.bean.impl;

import by.epamtc.komarov.appliance.bean.Appliance;

import java.util.Objects;

public class TabletPC extends Appliance {

    private int battery_capacity;
    private int display_inches;
    private int memory_rom;
    private int flash_memory_capacity;
    private String color;

    public TabletPC(){

    }

    public int getBattery_capacity() {
        return battery_capacity;
    }

    public int getDisplay_inches() {
        return display_inches;
    }

    public int getMemory_rom() {
        return memory_rom;
    }

    public int getFlash_memory_capacity() {
        return flash_memory_capacity;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "TabletPC : " +
                "battery_capacity=" + battery_capacity +
                ", display_inches=" + display_inches +
                ", memory_rom=" + memory_rom +
                ", flash_memory_capacity=" + flash_memory_capacity +
                ", color='" + color + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return battery_capacity == tabletPC.battery_capacity &&
                display_inches == tabletPC.display_inches &&
                memory_rom == tabletPC.memory_rom &&
                flash_memory_capacity == tabletPC.flash_memory_capacity &&
                color.equals(tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(battery_capacity, display_inches, memory_rom, flash_memory_capacity, color);
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
