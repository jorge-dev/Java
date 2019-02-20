package com.jdev.java;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("North");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12,"White");

        Bed bed = new Bed("Modern",2,4,2,1);

        Lamp lamp = new Lamp("Modern",true,90);

        Bedroom bedroom = new Bedroom("Tims",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}
