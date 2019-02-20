package com.jdev.java;

public class Vehicle {
    private String name, size;
    private int currentVelocity, currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer (int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + "degrees");
    }

    public void move (int velocity, int direction){
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.steer(): Moving at " + currentVelocity + " in direction "+currentDirection + " degrees");


    }

    public void stop (){
        this.currentVelocity = 0;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public void setCurrenDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }



    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrenDirection() {
        return currentDirection;
    }
}
