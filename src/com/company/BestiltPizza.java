package com.company;



public class BestiltPizza extends Pizza {

    public String red = "\u001B[31m";
    public String fReset = "\u001B[0m";
    public String green = "\u001B[32m";
    public String blue = "\u001B[34m";
    public String yellow = "\u001B[33m";
    public String cyan = "\u001B[36m";

    private String tidspunkt;
    private int kundeTlf;
    private String takeaway;


    public BestiltPizza(int pizzaNum, String pizzaNavn, String pizzaBeskrivelse, int pizzaPris, int kundeTlf, String tidspunkt, String takeaway) {
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

    public String toString() {
        StringBuilder text = new StringBuilder();
        text

                .append("\t")
                .append(red +" Tlf: " + fReset)
                .append(getKundeTlf())
                .append("\t")
                .append(" Tidspunkt:")
                .append(getTidspunkt())
                .append("\t")
                .append(" Takeaway:")
                .append(getTakeaway())
                .append("\t")
                .append(getPizzaPris())
                .append(" Kr")
                .append("\t ")
                .append("#")
                .append(getPizzaNum())
                .append("\t")
                .append(getPizzaName())
                .append("\t")
                .append(new UI().getColorString("cyan", getPizzaBeskrivelse()));

        return text.toString();
    }
}
  /*  @Override
    public String toString() {
        return "Nr " + getPizzaNum() + ". " + getPizzaName() + " " + getPizzaBeskrivelse() + " - " + getPizzaPris() + "kr.- " + " Telefon: " + kundeTlf + " " + "Tidspunkt: " + tidspunkt + " Takeaway: " + takeaway;
    }
}

   */