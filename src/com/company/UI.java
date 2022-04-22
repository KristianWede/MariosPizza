package com.company;

import java.util.Scanner;


public class UI {

    public String red = "\u001B[31m";
    public String fReset = "\u001B[0m";
    public String green = "\u001B[32m";
    public String blue = "\u001B[34m";
    public String yellow = "\u001B[33m";
    public String cyan = "\u001B[36m";


    private Color colorClass = new Color();

    public String getColorString(String color, String message) {
        return colorClass.colorText(color, message);
    }


    public void execute() throws InterruptedException {
        System.out.println("Starting up MariOS v0.8...");
        valgMenu();

    }

    public void valgMenu() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        PizzaMenu pizzaMenu = new PizzaMenu();
        pizzaMenu.erklaerPizza();

        do {

            printValg();

            int valg = sc.nextInt();

            switch (valg) {
                case 1 -> pizzaMenu.printPizzaMenu();
                case 2 -> pizzaMenu.printBestiltPizzaMenu();
                case 3 -> pizzaMenu.tilfoejPizza();
                case 4 -> pizzaMenu.fjernPizzaValg();
                case 5 -> System.exit(0);
                default -> System.out.println("Ikke et validt svar!");
            }

        }while(true);
    }

    private void printValg() throws InterruptedException {
        System.out.println("");
        System.out.println("Udprinter menu...");
        Thread.sleep(1000);
        System.out.println(yellow +"1: Menukort" + fReset);
        System.out.println("2: Liste over bestillinger");
        System.out.println("3: Tilføj ordre");
        System.out.println("4: Fjern ordre");
        System.out.println("5: Luk ned");

    }

}