package models;

//Abstract class capturing shared state between Desktop and Laptop
public abstract class Computer extends Product {
    private double cpuSpeed;
    private int ram;
    private boolean ssd;
    private int storage;

    public Computer(double initPrice, int initQuantity, double initCPUSpeed, int initRAM, boolean initSSD, int initStorage) {
        super(initPrice, initQuantity);
        cpuSpeed = initCPUSpeed;
        ram = initRAM;
        ssd = initSSD;
        storage = initStorage;
    }

    public double getCPUSpeed() {
        return cpuSpeed;
    }

    public int getRAM() {
        return ram;
    }

    public boolean getSSD() {
        return ssd;
    }

    public int getStorage() {
        return storage;
    }
}