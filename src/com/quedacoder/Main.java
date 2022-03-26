package com.quedacoder;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, motherBoard);

        // how do you draw using the montior class
        // thePC.getMonitor().drawPixelAt(1500,1200,"red");
        // thePC.getMotherBoard().loadProgram("Windows 1.0");
        // thePC.getTheCase().pressPowerButton();

        // cleaning up the way we call methods on composition classes
        // client code should not be able to access inner classes of a composition object
        thePC.powerUp();

    }
}
