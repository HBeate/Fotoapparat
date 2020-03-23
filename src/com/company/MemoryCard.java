package com.company;

public class MemoryCard {
    private String brand;
    private String model;
    private int totalStorage;
    private int actualStorage;

    public MemoryCard(String brand, String model, int totalStorage) {
        this.brand = brand;
        this.model = model;
        this.totalStorage = totalStorage;
    }
public void useMemory(int usedStorage){
        this.actualStorage += usedStorage;
    }
    public int getRestStorage(){
        return totalStorage - this. actualStorage;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getStorageSize() {
        return totalStorage;
    }
    @Override
    public String toString() {
        return  brand + " " + model;
    }

}
