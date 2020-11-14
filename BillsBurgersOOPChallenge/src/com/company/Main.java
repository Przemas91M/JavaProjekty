package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = ' ';
        Burger burger;
        String meatSelection;

        while (c != 'q') {
            System.out.println("Select burger type:");
            System.out.println("1: Normal burger \n2: Healthy burger\n3: Deluxe burger");
            c = scanner.nextLine().charAt(0);
            char type = c;
            System.out.println("Select meat:");
            System.out.println("1: Beef\n2: Pork\n3: Mixed");
            c = scanner.nextLine().charAt(0);
            char meat = c;
            switch (meat) {
                case '1':
                    meatSelection = "Beef";
                    break;
                case '2':
                    meatSelection = "Pork";
                    break;
                case '3':
                    meatSelection = "Mixed";
                    break;
                default:
                    return;
            }
            switch (type) {
                case '1':
                    burger = new Burger("Normal roll", meatSelection);
                    break;
                case '2':
                    burger = new HealthyBurger("Rye bread roll", meatSelection);
                    break;
                case '3':
                    burger = new DeluxeBurger("Deluxe roll", meatSelection);
                    break;
                default:
                    return;
            }
            if(type != '3') { //burger deluxe nie ma dodatków
                while (c != 'f' && burger.getAddonCount() < burger.getMaxAddons()) {
                    System.out.println("Select topping #" + (burger.getAddonCount() + 1) + ":");
                    System.out.println("1: Tomato\n2: Lettuce\n3: Cheese\n4: Onion\n5: Feta\nf: finish adding toppings");
                    c = scanner.nextLine().charAt(0);
                    if (c != 'f') {
                        burger.selectAddon(c);
                    }
                }
            }
            burger.order();
            System.out.println("Press any key to start a now order or enter 'q' to quit.");
            c = scanner.nextLine().charAt(0);
        }
        scanner.close();
    }
}
