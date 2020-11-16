package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i + 1 + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int index = findItem(currentItem);
        if (index >= 0) {
            modifyGroceryItem(index, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(String item){
        int index = findItem(item);
        if (index >= 0) {
            removeGroceryItem(index);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
        //boolean exists = groceryList.contains(searchItem);
        return groceryList.indexOf(searchItem); //szuka przedmiotu o podanej nazwie i zwraca index
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        return position >=0;
    }
}

