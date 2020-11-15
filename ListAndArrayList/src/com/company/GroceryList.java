package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println(i+1 + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    public void removeGroceryItem(int position){
        String item = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Removed " + item);
    }

    public String findItem(String searchItem){
        //boolean exists = groceryList.contains(searchItem);
        int index = groceryList.indexOf(searchItem); //szuka przedmiotu o podanej nazwie i zwraca index
        if(index >=0){
            return groceryList.get(index);
        }
        return null;
    }
}

