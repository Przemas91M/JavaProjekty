package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }

    }

    private static void printInstructions() {
        System.out.println("Press:");
        System.out.println("0 - print choice options");
        System.out.println("1 - print list of grocery items");
        System.out.println("2 - add item in the list");
        System.out.println("3 - modify item from the list");
        System.out.println("4 - remove item from list");
        System.out.println("5 - search for item");
        System.out.println("6 - quit");
    }


    private static void addItem() {
        System.out.println("Please enter the grocery item name:");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void modifyItem(){
        System.out.print("Enter item number: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item:");
        groceryList.modifyGroceryItem(index - 1, scanner.nextLine());
    }

    private static void removeItem(){
        System.out.print("Enter item number: ");
        groceryList.removeGroceryItem(scanner.nextInt() - 1);
        scanner.nextLine();
    }

    private static void searchForItem(){
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null){
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
}