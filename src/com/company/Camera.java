package com.company;

public class Camera {
    //    Objekte // Aufgabe
//    Erstellt euer eigenes FotoApparat Objekt, implementiert getter und setter für einzelne Werte.
//            z.B.
//   ● genaue Bezeichnung (set und get)
//   ● Megapixel (set und get)
//   ● Brennweite (set und get)
//   ● Herkunftsland (set und get)
//   ● Funktionen (mehrere, z.B. Selbstauslöser, Film, …)  (set und get)
//   ● Besitzer (set und get)
//   ● Produktblatt (get) ⇒ konkateniert einzelne Werte zu einem schönen Produktblatt und gibt den formatierten String zurück
//   ● ...
//    Googelt nach 2-3 Kameras und setzt die technischen Werte analog der gegoogelten Kameras. Am Ende benötigen wir ein Produktblatt der einzelnen Geräte (Konsolenausgabe).


    private String brand;
    private String model;
    private double megaPixel;
    private double displaySize;
    private String countryOfOrigin;
    private String owner;
    private MemoryCard memoryCard;
    private int pictureSize;
    private Lens lens;

    public Camera(String brand, String model, double megaPixel, double displaySize, int pictureSize, String countryOfOrigin) {
        this.brand = brand;
        this.model = model;
        this.megaPixel = megaPixel;
        this.displaySize = displaySize;
        this.countryOfOrigin = countryOfOrigin;
        this.pictureSize = 5;
        this.owner = " ";
    }

    public void takePicture() {
        if (this.memoryCard == null) {                  // Prüfung auf Null
            System.out.println("no card");
            return;
        }

        int restStorage = this.memoryCard.getRestStorage();
        if (restStorage >= pictureSize) {
            memoryCard.useMemory(pictureSize);
            restStorage = memoryCard.getRestStorage();
            int numberOfPicturesToTake = restStorage + 1000 / pictureSize;
            System.out.println("You can take " + numberOfPicturesToTake + " more pictures");
            System.out.println("Klick ");
        } else {
            System.out.println("There is not enough space on this card.");
            System.out.println("Would you like to delete ");
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
        System.out.println("You added a memory card." + memoryCard.getBrand() + " " + memoryCard.getModel());
    }

    public void setLens(Lens lens) {
        this.lens = lens;
        System.out.println("You added a lens:" + lens.getBrand() + " " + lens.getModel() + " with minimal folal length "
                + lens.getFocalLengthMin() + " and maximal focal length " + lens.getFocalLengthMax());
    }

    public void getSpecification() {
        System.out.println("\nSPECIFICATIONS: \nBrand: " + brand + "\nModel:" + model + "\nMegapixel: " + megaPixel
                + "\nMade in: " + countryOfOrigin + "\nOwner: " + owner + "\nMemory Card: " +  memoryCard + "\nLens: " + lens);
    }
}

