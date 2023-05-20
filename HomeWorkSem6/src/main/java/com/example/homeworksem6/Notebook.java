package com.example.homeworksem6;

public class Notebook {

    Integer ram;
    Integer hdd;
    String system;
    String color;

    public Notebook(Integer ram, Integer hdd, String system, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.system = system;
        this.color = color;
    }

    public boolean GetRam(Integer val) {
            if (ram == val) {
                return true;
            }
       return false;
    }
    public boolean GetHdd(Integer val) {
            if (hdd == val) {
                return true;
            }
       return false;
    }
    public boolean GetSystem(String val) {
            if (system.equalsIgnoreCase(val)) {
                return true;
            }
       return false;
    }
    public boolean GetColor(String val) {
            if (color.equalsIgnoreCase(val)) {
                return true;
            }
       return false;
    }

@Override
    public String toString() {
        return "{" +
                "ram: " + ram +
                ", hdd: " + hdd +
                ", system: " + system +
                ", color: " + color +
                "}";
    }
}
