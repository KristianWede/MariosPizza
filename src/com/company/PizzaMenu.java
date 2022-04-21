package com.company;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.Locale;
import java.util.Scanner;

public class PizzaMenu {

    private ArrayList<Pizza> pizzaArrayList = new ArrayList<>();
    private ArrayList<BestiltPizza> BestiltPizzaArrayList = new ArrayList<>();

    public void erklaerPizza() {
        Pizza vesuvio1 = new Pizza(1, "Vesuvio:", "tomatsauce,ost,skinke og oregano.", 57);
        Pizza amerikaner2 = new Pizza(2, "Amerikaner:", "tomatsauce,ost,oskefars og oregano.", 53);
        Pizza cacciatore3 = new Pizza(3, "Cacciatore:", "tomatsauce,ost,pepperoni og oregano.", 57);
        Pizza carbona4 = new Pizza(4, "Carbona:", "tomatsauce,ost,kødsauce,spaghetti,cocktailpølser og oregano.", 63);
        Pizza dennis5 = new Pizza(5, "Dennis:", "tomatsauce,ost,skinke,pepperoni,cocktailpølser og oregano.", 65);
        Pizza bertil6 = new Pizza(6, "Bertil:", "tomatsauce,ost,bacon og oregano.", 57);
        Pizza silvia7 = new Pizza(7, "Silvia:", "tomatsauce,ost,pepperoni,rød peber,løg,oliven og oregano.", 61);
        Pizza victoria8 = new Pizza(8, "Carbona:", "tomatsauce,ost,kødsauce,spaghetti,cocktailpølser og oregano.", 61);
        Pizza hawaii = new Pizza(9,"Hawaii:", "Tomat Sauce, ost, skinke, ananas.",59);
        Pizza mafiosa = new Pizza (10,"Mafiosa:", "Tomat Sauce, ost, skinke, champignon, paprika, hvidløg på, chili på",59);
        Pizza vienetta = new Pizza (11,"Vienetta:", "Tomat Sauce, ost, kylling, paprika, ærter og majs.", 59);
        Pizza mexicana = new Pizza (12,"Mexicana:", "Tomat Sauce, ost, kødsauce, paprika, chili på", 60);

        pizzaArrayList.add(vesuvio1);
        pizzaArrayList.add(amerikaner2);
        pizzaArrayList.add(cacciatore3);
        pizzaArrayList.add(carbona4);
        pizzaArrayList.add(dennis5);
        pizzaArrayList.add(bertil6);
        pizzaArrayList.add(silvia7);
        pizzaArrayList.add(victoria8);
        pizzaArrayList.add(hawaii);
        pizzaArrayList.add(mafiosa);
        pizzaArrayList.add(vienetta);
        pizzaArrayList.add(mexicana);

    }

    public void printPizzaMenu() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < pizzaArrayList.size(); i++) {
            System.out.println(pizzaArrayList.get(i));
        }
        System.out.println("Tryk på enter for at fortsætte...");
        String enter = sc.nextLine();
    }

    public void printBestiltPizzaMenu() {
        Scanner sc = new Scanner(System.in);
        if (BestiltPizzaArrayList.size() != 0) {
            for (int i = 0; i < BestiltPizzaArrayList.size(); i++) {
                System.out.println(BestiltPizzaArrayList.get(i));
            }
        } else {
            System.out.println("Ingen pizzaer bestilt!");
        }
        System.out.println("Tryk på enter for at fortsætte...");
        String enter = sc.nextLine();
    }

    public String tidspunkt(){
        String tid = String.valueOf(LocalTime.now());
        String bestillingsTid = tid.substring(0,5);
        return bestillingsTid;
    }

    public void tilfoejPizza() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Indtast antal af pizzaer du vil bestille: ");
        int pizzaAntal = sc.nextInt();
        System.out.println("Hvilken pizza vil du gerne bestille?");
        int pizzaNummer = sc.nextInt();
        System.out.println("Indtast kundens tlf:");
        int kundeTlf = sc.nextInt();

        boolean svar = false;
        String takeAway;
        System.out.println("Takeaway? ja/nej");

        do {
            takeAway = sc.next().toLowerCase();
            if (takeAway.equals("ja") || takeAway.equals("nej")) {
                svar = true;
            } else {
                System.out.println("Skriv enten ja eller nej.");
            }

        }while(!svar);

            for (int i = 0; i < pizzaArrayList.size(); i++) {
                if ( pizzaArrayList.get(pizzaNummer) == pizzaArrayList.get(i)) {
                    Pizza tmp = pizzaArrayList.get(i);
                    BestiltPizza tmp2 = new BestiltPizza(tmp.getPizzaNum(),tmp.getPizzaName(),tmp.getPizzaBeskrivelse(),tmp.getPizzaPris(),kundeTlf,tidspunkt(),takeAway);
                    for( int j = 0; j < pizzaAntal; j++) {
                        BestiltPizzaArrayList.add(tmp2);
                    }
                }
            }
        System.out.println("Ordre bestilt.");
    }
}
