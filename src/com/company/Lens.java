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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public static final int MIN_FOCALLENGTH = 10;

    public void setFocalLength(int focalLengthMin, int focalLengthMax) {
        if (focalLengthMin > this.focalLengthMax) {
            System.out.println("the minimal focal length can't be larger than the maximal focal length");
        } else {
            this.focalLengthMin = focalLengthMin;
            this.focalLengthMax = focalLengthMax;
        }
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }

}
