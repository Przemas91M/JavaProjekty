package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//
//        printlist(placesToVisit);
//
//        placesToVisit.add(1, "Alice Springs"); //działa tak samo jak dla zwykłej listy, lecz potrzebuje o wiele mniej przetwarzania
//
//        placesToVisit.remove(4); //wywali Perth
//
//        printlist(placesToVisit);

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");

        printlist(placesToVisit);

        addInOrder(placesToVisit, "AliceSprings");
        addInOrder(placesToVisit, "Darwin"); //tego nie powinno dodać!
        printlist(placesToVisit);

        visit(placesToVisit);


    }

    private static void printlist(LinkedList<String> list){
        Iterator<String> i = list.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("==============================");
    }

    private static boolean addInOrder(LinkedList<String> list, String newCity){
        ListIterator<String> iterator = list.listIterator(); //po deklaracji, iterator nie wskazuje na zadne miejsce w liscie
        //dopiero wywolanie metody next() powoduje przesuniecie iteratora na pierwsze miejsce w liscie!!!
        while(iterator.hasNext()){
            int comparison = iterator.next().compareTo(newCity); //sprawdzi, czy element jest juz na liscie oraz jego kolejnosc alfabetyczną
            if(comparison == 0){
                System.out.println(newCity + " is already on the list");
                return false;
            }
            else if(comparison > 0){ //newCity powinno się znaleźć przed tym rekordem, musimy sie cofnąć
            //Brisbane --> Adelaide
                iterator.previous();
                iterator.add(newCity);
                return true;
            }
            else if(comparison < 0){
                //jedziemy dalej
            }
        }
        //miasto ma znalezc sie na koncu listy.
        iterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("There are no cities on the list");
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Vacation is over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) { //jezeli sie cofniemy i potem pojdziemy dalej, to nadal bedziemy w tym samym miejscu, trzeba przesunac kursor dwa razy!!
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("MENU:");
        System.out.println("0 - quit");
        System.out.println("1 - go to next city");
        System.out.println("2 - go to previous city");
        System.out.println("3 - print menu");
    }
}
