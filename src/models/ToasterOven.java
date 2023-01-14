package models;

//Class representing a single toaster oven product
public class ToasterOven extends Appliance {
    private boolean convection;

    public ToasterOven(double initPrice, int initQuantity, int initWattage, String initColor, String initBrand, boolean initConvection) {
        super(initPrice, initQuantity, initWattage, initColor, initBrand);
        convection = initConvection;
    }

    public String toString() {
        String result = getBrand() + " Toaster ";
        if (convection) {
            result += "with convection ";
        }

        result += "(" + getColor() + ", " + getWattage() + " watts)";

        return result;
    }
}