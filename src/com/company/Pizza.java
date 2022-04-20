package com.company;

public class Pizza {

    private int pizzaNum;
    private String pizzaBeskrivelse;
    private int pizzaPris;

    public Pizza(int pizzaNum, String pizzaBeskrivelse, int pizzaPris) {
        this.pizzaNum = pizzaNum;
        this.pizzaBeskrivelse = pizzaBeskrivelse;
        this.pizzaPris = pizzaPris;
    }

    public void setPizzaNum(int pizzaNum) {
        this.pizzaNum = pizzaNum;
    }

    public void setPizzaBeskrivelse(String pizzaBeskrivelse) {
        this.pizzaBeskrivelse = pizzaBeskrivelse;
    }

    public void setPizzaPris(int pizzaPris) {
        this.pizzaPris = pizzaPris;
    }

    public int getPizzaNum() {
        return pizzaNum;
    }

    public String getPizzaBeskrivelse() {
        return pizzaBeskrivelse;
    }

    public int getPizzaPris() {
        return pizzaPris;
    }

    @Override
    public String toString() {
        return "Nr " + pizzaNum + ". " + pizzaBeskrivelse + " - " + pizzaPris + "kr.-";
    }
}