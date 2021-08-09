package com.company;

public class DeluxeBurger extends Hamburger{

private boolean chips;
private boolean drinks;

    public DeluxeBurger(String breadRoll, String meat, double price) {
        super("Deluxe Burger", breadRoll, meat, price);
        this.chips = true;
        this.drinks = true;
    }

    @Override
    public void addLettuce() {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addTomato() {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addCarrot() {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addCorn() {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
