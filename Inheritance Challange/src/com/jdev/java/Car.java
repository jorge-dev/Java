package com.jdev.java;

public class Car extends Vehicle {

    private int wheels, doors, gears, currentGear;
    private boolean isManuel;



    public Car(String name, String size, int wheels, int doors, int gears, boolean isManuel) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 1;
        this.isManuel = isManuel;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Changed to: " + this.currentGear + " gear ");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
        move(speed,direction);


    }


}
