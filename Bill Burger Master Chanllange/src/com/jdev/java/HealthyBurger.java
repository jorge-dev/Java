package com.jdev.java;

public class HealthyBurger extends Hamburger {

    private String healthyExtraName1;
    private double healthyExtraPrice1;

    private String healthyExtraName2;
    private double healthyExtraPrice2;

    public HealthyBurger( String meat,  double price) {
        super("Healthy", meat, "Brown rye", price);
    }

    public void addHealthAddition1 (String name, double price){
        this.healthyExtraName1 = name;
        this.healthyExtraPrice1 = price;
    }

    public void addHealthAddition2 (String name, double price){
        this.healthyExtraName2 = name;
        this.healthyExtraPrice2 = price;
    }

    @Override
    public double itemizeHamburger() {
        double hambPrice = super.itemizeHamburger();

        if (this.healthyExtraName1 != null) {
            hambPrice += this.healthyExtraPrice1;
            System.out.println("Added " + this.healthyExtraName1 + " for an extra $" + this.healthyExtraPrice1);
        }

        if (this.healthyExtraName2 != null) {
            hambPrice += this.healthyExtraPrice2;
            System.out.println("Added " + this.healthyExtraName2 + " for an extra $" + this.healthyExtraPrice2);
        }

        return hambPrice;
    }
}


