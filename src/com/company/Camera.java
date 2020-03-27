package com.company;

import java.util.Scanner;

public class Camera {

    private String brand;
    private String model;
    private double megaPixel;
    private double displaySize;
    private String countryOfOrigin;
    private String owner = "";
    private MemoryCard memoryCard;
    private int pictureSizeInMb;
    private Lens lens;

    public Camera(String brand, String model, double megaPixel, double displaySize, int pictureSizeInMB, String countryOfOrigin) {
        this.brand = brand;
        this.model = model;
        this.megaPixel = megaPixel;
        this.displaySize = displaySize;
        this.countryOfOrigin = countryOfOrigin;
        this.pictureSizeInMb = pictureSizeInMB;
    }

    public void takePicture() {
        if (this.lens == null || this.memoryCard == null) { // Prüfung auf Null
            System.out.println("card and lenses are needed");
        } else {
            int restStorage = this.memoryCard.getRestStorageInMB();
            if (restStorage >= pictureSizeInMb) {
                memoryCard.useMemory(pictureSizeInMb);
                double numberOfPicturesToTake = restStorage / pictureSizeInMb;
                System.out.println("Klick ");
                System.out.println("You can take " + numberOfPicturesToTake + " more pictures. " +
                        "Restlicher Speicherplatz ist: " + restStorage);
            } else {
                System.out.println("There is not enough space on this card.");
                System.out.println("Would you like to delete pictures? (yes/no)");
                Scanner inputScanner = new Scanner(System.in);
                String userInput = inputScanner.next();
                switch (userInput.toLowerCase()) {
                    case "yes":
                        System.out.println("How many pictures would you like to delete?");
                        int userInputNumber = inputScanner.nextInt();
                        memoryCard.freeMemory(userInputNumber * pictureSizeInMb);
                        System.out.println(restStorage);
                        break;
                    case "no":
                        System.out.println("Your memory card if full. You can't take any more pictures.");
                        break;
                }
            }
        }
    }

    public void setMegaPixel(int megaPixel) {
        if (megaPixel < 1) {
            System.out.println("too small value for megapixel");
        } else {
            this.megaPixel = megaPixel;
        }
    }

    public void setOwner(String owner) {
        this.owner = owner;
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
                + lens.getFocalLengthFromTo());
    }
}

