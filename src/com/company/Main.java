package com.company;

public class Main {

    public static void main(String[] args) {

        Camera myNikon = new Camera("Nikon", "D500", 21,3.2, "China",
                "Alexander");

        Camera mySony = new Camera("Sony", "a100",10.2,2.5, "Thailand",
                "Beate");


        myNikon.takePicture();
        myNikon.setMegaPixel(10);

    myNikon.takePicture();
    }

}
