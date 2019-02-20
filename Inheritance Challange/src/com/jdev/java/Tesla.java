package com.jdev.java;

public class Tesla extends Car {

    private int roadServiceMonths;

    public Tesla(int roadServiceMonths) {
        super("Tesla ModelS", "2WD", 4, 4, 2, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        }
        else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else
            changeGear(2);


        if(newVelocity > 0)

            changeVelocity(newVelocity,getCurrenDirection());


    }
}
