package com.company;

public class MemoryCard {
    private String brand;
    private String model;
    private int totalStorageInMb;
    private int actualStorageInMb;

    public MemoryCard(String brand, String model, int totalStorageInMb) {
        this.brand = brand;
        this.model = model;
        this.totalStorageInMb = totalStorageInMb;
    }

    public void useMemory(int usedStorageInMb){
        this.actualStorageInMb += usedStorageInMb;
    }

    public void freeMemory(int freedStorageInMb) {
        this.actualStorageInMb -= freedStorageInMb;
    }

    public int getRestStorageInMB(){
        return totalStorageInMb - this.actualStorageInMb;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return  brand + " " + model + " / " + totalStorageInMb + "MB";
    }

}
