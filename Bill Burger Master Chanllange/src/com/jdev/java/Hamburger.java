package com.jdev.java;

public class Hamburger {
    private String name, meat, breadRollType;
    private double price;

    private String additionName1;
    private double additionPrice1;

    private String additionName2;
    private double additionPrice2;

    private String additionName3;
    private double additionPrice3;

    private String additionName4;
    private double additionPrice4;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHambAdd1 (String name, double price){
        this.additionName1 = name;
        this.additionPrice1= price;

    }

    public void addHambAdd2 (String name, double price){
        this.additionName2 = name;
        this.additionPrice2= price;

    }

    public void addHambAdd3 (String name, double price){
        this.additionName3 = name;
        this.additionPrice3= price;

    }

    public void addHambAdd4 (String name, double price){
        this.additionName4 = name;
        this.additionPrice4= price;

    }

    public double itemizeHamburger (){
        double hambPrice = this.price;
        System.out.println(this.name + " hamburger " + "on a " + this.breadRollType + "roll "
                                     + "whith " + this.meat + " ---- price is " + this.price);

        if (this.additionName1 != null){
            hambPrice += this.additionPrice1;
            System.out.println("Added " + this.additionName1 + " for an extra $" + this.additionPrice1 );
        }

        if (this.additionName2 != null){
            hambPrice += this.additionPrice2;
            System.out.println("Added " + this.additionName2 + " for an extra $" + this.additionPrice2 );
        }

        if (this.additionName3 != null){
            hambPrice += this.additionPrice3;
            System.out.println("Added " + this.additionName3 + " for an extra $" + this.additionPrice3 );
        }

        if (this.additionName4 != null){
            hambPrice += this.additionPrice1;
            System.out.println("Added " + this.additionName4 + " for an extra $" + this.additionPrice4 );
        }



        return hambPrice;
    }
}
