package com.company;

import java.time.LocalTime;
import java.util.ArrayList;
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
                System.out.println("#" + (i+1) + " " + BestiltPizzaArrayList.get(i));
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

        int pizzaNummer;
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
        } while (!svar);


        System.out.println("Indtast antal af pizzaer du vil bestille: ");
        int pizzaAntal = sc.nextInt();

        for (int i = 0; i < pizzaAntal; i++) {
            System.out.println("Hvilken pizza vil du gerne bestille?");
            pizzaNummer = sc.nextInt();
            System.out.println("Pizza nummer: " + (i + 1));
            for (int k = 0; k < pizzaArrayList.size(); k++) {
                if (pizzaArrayList.get(k).getPizzaNum() == pizzaNummer) {
                    System.out.println(pizzaArrayList.get(k));

                    Pizza tmp = pizzaArrayList.get(k);
                    BestiltPizza tmp2 = new BestiltPizza(tmp.getPizzaNum(), tmp.getPizzaName(), tmp.getPizzaBeskrivelse(), tmp.getPizzaPris(), kundeTlf, tidspunkt(), takeAway);
                    BestiltPizzaArrayList.add(tmp2);

                }
            }
        }
        System.out.println("Ordre bestilt.");
    }

        //Sammenligner indtastet pizzanummer og finder den rette pizza, hvorefter den så bliver lavet om til et bestiltPizza plus alt andet indtastet info.

    public void fjernPizzaValg(){
        System.out.println("Hvad vil du fjerne fra en ordre?");
        System.out.println("""
            1. Fjern en Pizza med ordreplads.
            2. Fjern hele ordre med kundeTlf.
            """);
        Scanner sc = new Scanner(System.in);
        int valg = sc.nextInt();
        switch(valg){
            case 1 -> fjernEnPizza();
            case 2 -> fjernHeleOrdre();
            default -> System.out.println("Ikke et validt svar!");
        }
    }

    public void fjernEnPizza() {
        System.out.println("Indtast ordres nummer som skal fjernes.");

        if (BestiltPizzaArrayList.size() != 0) {
            for (int i = 0; i < BestiltPizzaArrayList.size(); i++) {
                System.out.println("#" + (i+1) + " " + BestiltPizzaArrayList.get(i));
            }
        } else {
            System.out.println("Ingen pizzaer bestilt!");
        }

        Scanner sc = new Scanner(System.in);
        int pizzaNum = sc.nextInt();
        BestiltPizzaArrayList.remove(pizzaNum-1);
    }

    public void fjernHeleOrdre() {
        System.out.println("Indtast kundens telefonnummer for at fjerne bestillingen.");
        Scanner sc = new Scanner(System.in);
        int kundeTlf = sc.nextInt();
        boolean ordreFundet = false;
        for ( int i = 0; i < BestiltPizzaArrayList.size(); i++){
            if (BestiltPizzaArrayList.get(i).getKundeTlf() == kundeTlf ){
                BestiltPizzaArrayList.remove(i);
                i--;
                ordreFundet = true;
            }
        }
        if (ordreFundet) {
            System.out.println("Ordre fjernet.");
        } else {
            System.out.println("Kunne ikke finde nogen ordre med tlf: " + kundeTlf);
        }
    }

}