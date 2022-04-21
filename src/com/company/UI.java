package com.company;

import java.util.Scanner;

public class UI {

    public void execute() throws InterruptedException {
        System.out.println("Starting up MariOS v0.8...");
        valgMenu();

    }

    public void valgMenu() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        PizzaMenu pizzaMenu = new PizzaMenu();
        pizzaMenu.erklaerPizza();

        //do {

            printValg();

            int valg = sc.nextInt();

            switch (valg) {
                case 1 -> pizzaMenu.printPizzaMenu();
                case 2 -> pizzaMenu.printBestiltPizzaMenu();
                case 3 -> pizzaMenu.tilfoejPizza();
                case 4 -> pizzaMenu.tidspunkt();
                case 5 -> System.out.println("Case5");
                //case 6 -> {
                   // System.exit(0);
                //}
                default -> {
                    System.out.println("Ikke et validt svar!");
                }
            }

        //}while(true);
    }

   private void printValg() throws InterruptedException {
        System.out.println("");
        System.out.println("Udprinter menu...");
        Thread.sleep(1000);
        System.out.println("1: Menukort");
        System.out.println("2: Liste over bestillinger");
        System.out.println("3: Tilføj ordre");
        System.out.println("4: Afhent ordre");
        System.out.println("5: Annuller ordre");
        System.out.println("6: Luk ned");

    }

}
