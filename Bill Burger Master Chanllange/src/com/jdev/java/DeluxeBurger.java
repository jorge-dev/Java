package com.jdev.java;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Sausage & bacon", "White", 15.0);
        super.addHambAdd1("Fries",2.25);
        super.addHambAdd2("Drink",2.55);
    }

    @Override
    public void addHambAdd1(String name, double price) {
        System.out.println("Cant add any additional items to a deluxe burger");
    }

    @Override
    public void addHambAdd2(String name, double price) {
        System.out.println("Cant add any additional items to a deluxe burger");
    }

    @Override
    public void addHambAdd3(String name, double price) {
        System.out.println("Cant add any additional items to a deluxe burger");
    }

    @Override
    public void addHambAdd4(String name, double price) {
        System.out.println("Cant add any additional items to a deluxe burger");
    }
}
