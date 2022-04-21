package com.company;

public class BestiltPizza extends Pizza{

private int tidspunkt;
private int kundeTlf;


    public BestiltPizza(int pizzaNum,String pizzaName, String pizzaBeskrivelse, int pizzaPris) {
        super(pizzaNum, pizzaName, pizzaBeskrivelse, pizzaPris);
        this.tidspunkt = tidspunkt;
        this.kundeTlf = kundeTlf;

    }
}
