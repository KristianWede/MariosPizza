package com.company;

public class Pizza {

    private int pizzaNum;
    private String pizzaName;
    private String pizzaBeskrivelse;
    private int pizzaPris;

    public Pizza(int pizzaNum, String pizzaName, String pizzaBeskrivelse, int pizzaPris) {
        this.pizzaNum = pizzaNum;
        this.pizzaName = pizzaName;
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

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }


    @Override
    public String toString() {
        return "Nr " + pizzaNum + ". " + pizzaName +" " + pizzaBeskrivelse + " - " + pizzaPris + "kr.-";
    }
}
