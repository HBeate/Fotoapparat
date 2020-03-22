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
    private double memoryCard;
    private String lens;

    public Camera(String brand, String model, double megaPixel, double displaySize, String countryOfOrigin, String owner) {
        this.brand = brand;
        this.model = model;
        this.megaPixel = megaPixel;
        this.displaySize = displaySize;
        this.countryOfOrigin = countryOfOrigin;
        this.owner = owner;

    }



    public void takePicture() {
        System.out.println("Klick ");
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
}


