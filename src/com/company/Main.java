package com.company;

public class Main {

    public static void main(String[] args) {
        MemoryCard memoryCard1 = new MemoryCard("ScanDisk", "Extreme Pro SDXC UHS-I", 7);
        MemoryCard memoryCard2 = new MemoryCard("Lexar", "Professional Class 10 UHS-II", 128);
        Lens lens1 = new Lens("Nikon", "wide angle", 16, 35);
        Lens lens2 = new Lens("Sigma", "telephoto", 200, 500);

        Camera myNikon = new Camera("Nikon", "D500", 21, 23.2, 5,
                "China");

        Camera mySony = new Camera("Sony", "a100", 10.2, 2.5, 10,
                "Thailand");

        myNikon.takePicture();
        myNikon.setMemoryCard(memoryCard1);
        myNikon.setLens(lens2);
        myNikon.setMegaPixel(10);
        myNikon.takePicture();
        myNikon.takePicture();
        myNikon.takePicture();
        myNikon.takePicture();
        myNikon.takePicture();
        myNikon.takePicture();
        myNikon.setOwner("Beate");
        myNikon.setMemoryCard(memoryCard2);
        myNikon.takePicture();
        myNikon.takePicture();
        myNikon.takePicture();
        myNikon.takePicture();
        System.out.println("Memorycard 1 free storage: " + memoryCard1.getRestStorageInMB());
        System.out.println("Memorycard 2 free storage: " + memoryCard2.getRestStorageInMB());
        myNikon.getSpecification();



    }

}
