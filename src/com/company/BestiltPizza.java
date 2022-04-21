package com.company;

public class BestiltPizza extends Pizza{

private String tidspunkt;
private int kundeTlf;
private String takeaway;


    public BestiltPizza(int pizzaNum,String pizzaNavn, String pizzaBeskrivelse, int pizzaPris, int kundeTlf, String tidspunkt, String takeaway) {
        super(pizzaNum, pizzaNavn, pizzaBeskrivelse, pizzaPris);
        this.tidspunkt = tidspunkt;
        this.kundeTlf = kundeTlf;
        this.takeaway = takeaway;
    }

    public String getTidspunkt() {
        return tidspunkt;
    }

    public int getKundeTlf() {
        return kundeTlf;
    }

    public String getTakeaway() {
        return takeaway;
    }

    @Override
    public String toString() {
        return "Nr " + getPizzaNum() + ". " + getPizzaName() +" " + getPizzaBeskrivelse() + " - " + getPizzaPris() + "kr.- " + " Telefon: " + kundeTlf + " " + "Tidspunkt: " + tidspunkt + " Takeaway: " + takeaway;
    }
}
