package com.company;

import java.util.Scanner;

public class Camera {

    private String brand;
    private String model;
    private double megaPixel;
    private double displaySize;
    private String countryOfOrigin;
    private String owner;
    private MemoryCard memoryCard;
    private int pictureSizeInMB;
    private Lens lens;

    public Camera(String brand, String model, double megaPixel, double displaySize, int pictureSizeInMB, String countryOfOrigin) {
        this.brand = brand;
        this.model = model;
        this.megaPixel = megaPixel;
        this.displaySize = displaySize;
        this.countryOfOrigin = countryOfOrigin;
        this.pictureSizeInMB = 5;
        this.owner = " ";
    }
//TODO see if they want to delete pictures if there isn't enough space on the card
    public void takePicture() {
        // Prüfung auf Null
        if (this.memoryCard == null) {
            System.out.println("no card");
            return;
        }
        if (this.memoryCard.getRestStorageInMB() >= pictureSizeInMB) {
            memoryCard.useMemory(pictureSizeInMB);
            double numberOfPicturesToTake = this.memoryCard.getRestStorageInMB() / pictureSizeInMB;
            System.out.println("You can take " + numberOfPicturesToTake + " more pictures");
            System.out.println("Klick ");
            System.out.println("Restlicher Speicherplatz ist: " + this.memoryCard.getRestStorageInMB());
        } else {
            System.out.println("There is not enough space on this card.");
            System.out.println("Would you like to delete pictures? (yes/no");
            Scanner inputScanner = new Scanner(System.in);
            String userInput = inputScanner.next();
            userInput = userInput.toLowerCase();
           if (userInput == "yes"){
               System.out.println("How many pictures would you like to delete?");
               String userInputNumber = inputScanner.next();
           }

        }
    }

    public double getMegaPixel() {
        return megaPixel;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setMegaPixel(int megaPixel) {
        if (megaPixel < 1) {
            System.out.println("too small value for megapixel");
        } else {
            this.megaPixel = megaPixel;
        }
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public MemoryCard getMemoryCard() {
        return memoryCard;
    }

    public Lens getLens() {
        return lens;
    }

    public void setMemoryCard(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
        System.out.println("You added a memory card." + memoryCard.getBrand() + " " + memoryCard.getModel() + " / "
                + memoryCard.getRestStorageInMB() + "MB");
    }

    public void setLens(Lens lens) {
        this.lens = lens;
        System.out.println("You added a lens:" + lens.getBrand() + " " + lens.getModel() + " with minimal folal length "
                + lens.getFocalLengthMin() + " and maximal focal length " + lens.getFocalLengthMax());
    }

    public void getSpecification() {
        System.out.println("\nSPECIFICATIONS: \nBrand: " + brand + "\nModel:" + model + "\nMegapixel: " + megaPixel
                + "\nMade in: " + countryOfOrigin + "\nOwner: " + owner + "\nMemory Card: " + memoryCard
                + "\nStorage left on card: " + memoryCard.getRestStorageInMB() + "\nLens: " + lens + " "
                + lens.getFocalLengthFromTo() + "MB");
    }
}

