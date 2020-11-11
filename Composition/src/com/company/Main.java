package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
	    Case theCase = new Case("220B", "Dell", "240W", dimensions);// mozemy tak inicjowac obiekt
	    Monitor theMonitor = new Monitor("27inch Beast", "Asus", 27, new Resolution(2540, 1440)); //albo inicjowac bezposrednio
	    Motherboard theMotherboard = new Motherboard("BJ-200", "MSI", 4, 2, "v2.44");

	    PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.powerUp(); //odpalamy zagnieżdżone funkcje


        //challenge

        Window window = new Window(1, 1, "white");
        Door door = new Door(2, 1, "brown");
        OfficeDesk desk = new OfficeDesk("white", "wood", 1, 6);

        LivingRoom myRoom = new LivingRoom(door, window, desk);
        myRoom.enterRoom();
        myRoom.getSomeFreshAir();
        myRoom.getPenFromDesk();
        myRoom.searchDrawer(8);
        myRoom.exitRoom();
        System.out.println(myRoom.getDoor().getColor()); //do innych obiektów nie mamy getterów więc nie dostanę się do ich właściwości.
    }
}
