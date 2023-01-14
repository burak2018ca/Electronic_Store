package models;

//Class representing a single laptop product
public class Laptop extends Computer {
    private double screenSize;

    public Laptop(double initPrice, int initQuantity, double initCPUSpeed, int initRAM, boolean initSSD, int initStorage, double initScreen) {
        super(initPrice, initQuantity, initCPUSpeed, initRAM, initSSD, initStorage);
        screenSize = initScreen;
    }

    public String toString() {
        String result = screenSize + " inch Laptop PC with " + getCPUSpeed() + "ghz CPU, " + getRAM() + "GB RAM, " + getStorage() + "GB ";
        if (getSSD()) {
            result += "SSD drive.";
        } else {
            result += "HDD drive.";
        }
        return result;
    }
}