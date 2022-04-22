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
        System.out.println("\n" +
                "███████╗████████╗ █████╗ ██████╗ ████████╗██╗███╗   ██╗ ██████╗     ██╗   ██╗██████╗     ███╗   ███╗ █████╗ ██████╗ ██╗ ██████╗ ███████╗    ██╗   ██╗ ██████╗     █████╗          \n" +
                "██╔════╝╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝██║████╗  ██║██╔════╝     ██║   ██║██╔══██╗    ████╗ ████║██╔══██╗██╔══██╗██║██╔═══██╗██╔════╝    ██║   ██║██╔═████╗   ██╔══██╗         \n" +
                "███████╗   ██║   ███████║██████╔╝   ██║   ██║██╔██╗ ██║██║  ███╗    ██║   ██║██████╔╝    ██╔████╔██║███████║██████╔╝██║██║   ██║███████╗    ██║   ██║██║██╔██║   ╚█████╔╝         \n" +
                "╚════██║   ██║   ██╔══██║██╔══██╗   ██║   ██║██║╚██╗██║██║   ██║    ██║   ██║██╔═══╝     ██║╚██╔╝██║██╔══██║██╔══██╗██║██║   ██║╚════██║    ╚██╗ ██╔╝████╔╝██║   ██╔══██╗         \n" +
                "███████║   ██║   ██║  ██║██║  ██║   ██║   ██║██║ ╚████║╚██████╔╝    ╚██████╔╝██║         ██║ ╚═╝ ██║██║  ██║██║  ██║██║╚██████╔╝███████║     ╚████╔╝ ╚██████╔╝██╗╚█████╔╝██╗██╗██╗\n" +
                "╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝   ╚═╝╚═╝  ╚═══╝ ╚═════╝      ╚═════╝ ╚═╝         ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝ ╚═════╝ ╚══════╝      ╚═══╝   ╚═════╝ ╚═╝ ╚════╝ ╚═╝╚═╝╚═╝\n" +
                "                                                                                                                                                                                  \n" + fReset +
        red +" ███████████████████████████████████████████████████████" +fReset +" ███████████████████████████████████████████████████████████" + green + " █████████████████████████████████████████████████████████████" + fReset);
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
        System.out.print(yellow + "Udprinter menu" + fReset);
        Thread.sleep(350);
        System.out.print(".");
        Thread.sleep(350);
        System.out.print(".");
        Thread.sleep(350);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println("");
        System.out.println( blue +"1: Menukort" + fReset);
        System.out.println( yellow + "2: Liste over bestillinger" +fReset);
        System.out.println( blue +"3: Tilføj ordre" + fReset);
        System.out.println(yellow + "4: Fjern ordre" + fReset);
        System.out.println(red + "5: Luk ned" + fReset);

    }

}