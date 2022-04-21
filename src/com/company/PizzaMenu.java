package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaMenu {

    private ArrayList<Pizza> pizzaArrayList = new ArrayList<>();
    private ArrayList<Pizza> BestiltPizzaArrayList = new ArrayList<>();

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


    public void tilfoejPizza() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Antal af pizzaer du vil bestille: ");
        int pizzaAntal = sc.nextInt();

        //Bestilling bestilling = new Bestilling(pizzaAntal);

        for(int i = 0; i<pizzaAntal; i++){
            System.out.println("Hvilken pizza vil du gerne have?");
            int pizzaNummer = sc.nextInt();
            System.out.println("Pizza nummer: " + (i+1));
                for (int k = 0; k < pizzaArrayList.size(); k++) {

                     if (pizzaArrayList.get(k).getPizzaNum() == pizzaNummer) {
                        System.out.println(pizzaArrayList.get(k));

                }
            }
        }
        System.out.println();
    }
    public void addPizzaToOrdreList(Pizza pizza){
        BestiltPizzaArrayList.add(pizza);
    }

    public void sætIndIOrdreArray(){
        BestiltPizzaArrayList.add();
            //addPizzaToOrdreList(Pizza);

        }



    public void printBestiltPizzaMenu() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < BestiltPizzaArrayList.size(); i++) {
            System.out.println(BestiltPizzaArrayList.get(i));
        }
        System.out.println("Tryk på enter for at fortsætte...");
        String enter = sc.nextLine();
    }






        /*
        int valg;

        System.out.println("Indtast nummer af pizza du vil bestille");
        valg = sc.nextInt();

        for(int i = 0; i <valg;i++) {
            System.out.println("Hvilken pizza vil du gerne bestille?");
            for (int j = 0; j < pizzaArrayList.size(); j++) {
                if ( pizzaArrayList.get(valg) == pizzaArrayList.get(i)) {
                    Pizza tmp = pizzaArrayList.get(i);
                    BestiltPizzaArrayList.add(tmp);
                }*/
            }
