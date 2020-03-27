package com.company;

public class Lens {

    private String brand;
    private String model;
    private int focalLengthMin;
    private int focalLengthMax;

    public Lens(String brand, String model, int focalLengthMin, int focalLengthMax) {
        this.brand = brand;
        this.model = model;
        this.focalLengthMin = focalLengthMin;
        this.focalLengthMax = focalLengthMax;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getFocalLengthFromTo() {
        return getFocalLengthMin() + " bis " + getFocalLengthMax();
    }

    public int getFocalLengthMin() {
        return focalLengthMin;
    }

    public int getFocalLengthMax() {
        return focalLengthMax;
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }

}
