package com.company;

public class Hamburger {

    private String name;
    private String breadRoll;
    private String meat;
    private double price;

    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean corn;

    public Hamburger(String name, String breadRoll, String meat, double price) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;

        this.lettuce = false;
        this.tomato = false;
        this.carrot = false;
        this.corn = false;
    }


    public void addLettuce() {
        this.lettuce = true;
    }

    public void addTomato() {
        this.tomato = true;
    }

    public void addCarrot() {
        this.carrot = true;
    }

    public void addCorn() {
        this.corn = true;
    }

    public double showPrice(){

        System.out.println(this.name + " hamburger " + " on a " + this.breadRoll + " roll with "  + this.meat + " filling , base price is " + this.price);

        if (lettuce == true) {
            this.price = this.price + 1.00;
            System.out.println("Added lettuce for £1.00");
        }

        if (tomato == true) {
            this.price = this.price + 1.00;
            System.out.println("Added tomato for £1.00");
        }

        if (carrot == true) {
            this.price = this.price + 1.00;
            System.out.println("Added carrot for £1.00");
        }

        if (corn == true) {
            this.price = this.price + 1.00;
            System.out.println("Added corn for £1.00");
        }

        return this.price;
    }


}
