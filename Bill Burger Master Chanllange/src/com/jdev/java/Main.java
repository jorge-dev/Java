package com.jdev.java;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","Beef","White",4.00);
        double price = hamburger.itemizeHamburger();
        hamburger.addHambAdd1("Tomato",.56);
        hamburger.addHambAdd2("Lettuce",.70);
        hamburger.addHambAdd3("Bacon",1.75);
        hamburger.addHambAdd4("Cheese",2.30);
        System.out.println("Total burger price is : $" + hamburger.itemizeHamburger() + "\n");

        HealthyBurger healthyBurger = new HealthyBurger("Chicken",3.99);
        healthyBurger.addHambAdd1("Egg",3.30);
        healthyBurger.addHealthAddition1("Lentils",3.50);
        //healthyBurger.itemizeHamburger();
        System.out.println("Total Healthy burger price is : $" + healthyBurger.itemizeHamburger() + "\n");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
        deluxeBurger.addHambAdd1("asas",23.3);


    }
}
