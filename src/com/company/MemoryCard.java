package com.company;

public class MemoryCard {
    private String brand;
    private String model;
    private int totalStorageInMB;
    private int actualStorageInMB;

    public MemoryCard(String brand, String model, int totalStorageInMB) {
        this.brand = brand;
        this.model = model;
        this.totalStorageInMB = totalStorageInMB;
    }


    public void useMemory(int usedStorageInMB){
        this.actualStorageInMB += usedStorageInMB;
    }
    public int getRestStorageInMB(){
        return totalStorageInMB - this.actualStorageInMB;
    }

//    public int getRestStorageInGB(){
//        return getRestStorageInMB() / 1024;
//    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getStorageSize() {
        return totalStorageInMB;
    }
    @Override
    public String toString() {
        return  brand + " " + model + " / " + totalStorageInMB + "MB";
    }

}
