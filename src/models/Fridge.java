package models;

//Class representing a single type of Fridge
public class Fridge extends Appliance {
    private boolean hasFreezer;

    public Fridge(double initPrice, int initQuantity, int initWattage, String initColor, String initBrand, boolean initFreezer) {
        super(initPrice, initQuantity, initWattage, initColor, initBrand);
        hasFreezer = initFreezer;
    }

    public String toString() {
        String result = getBrand() + " Fridge ";
        if (hasFreezer) {
            result += "with Freezer ";
        }

        result += "(" + getColor() + ", " + getWattage() + " watts)";

        return result;
    }
}