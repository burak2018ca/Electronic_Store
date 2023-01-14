package models;

//Class representing a single desktop computer
public class Desktop extends Computer {
    private String towerProfile;

    public Desktop(double initPrice, int initQuantity, double initCPUSpeed, int initRAM, boolean initSSD, int initStorage, String initProfile) {
        super(initPrice, initQuantity, initCPUSpeed, initRAM, initSSD, initStorage);
        towerProfile = initProfile;
    }

    public String toString() {
        String result = towerProfile + " Desktop PC with " + getCPUSpeed() + "ghz CPU, " + getRAM() + "GB RAM, " + getStorage() + "GB ";
        if (getSSD()) {
            result += "SSD drive.";
        } else {
            result += "HDD drive.";
        }
        return result;
    }
}