package com.company;

public class HealthyBurger extends Hamburger{

    private boolean olives;
    private boolean pickles;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", "Brown Rye Bread", meat, price);
        this.olives = false;
        this.pickles = false;
    }

    public void addOlives() {
        this.olives = true;
    }

    public void addPickles() {
        this.pickles = true;
    }

    @Override
    public double showPrice() {
        double price = super.showPrice();

        if (this.olives == true) {
            price = price + 1.00;
            System.out.println("Added olives for £1.00");
        }

        if (this.pickles == true) {
            price = price + 1.00;
            System.out.println("Added pickles for £1.00");
        }

        return price;
    }
}
