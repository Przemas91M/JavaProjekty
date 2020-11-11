package com.company;

public class LivingRoom {
    private Door door;
    private Window window;
    private OfficeDesk desk;

    public LivingRoom(Door door, Window window, OfficeDesk desk) {
        this.door = door;
        this.window = window;
        this.desk = desk;
    }

    public Door getDoor() {
        return door;
    }

    public void enterRoom(){
        door.openDoor();
        System.out.println("I'm in the room");
        door.closeDoor();
    }

    public void exitRoom(){
        door.openDoor();
        System.out.println("I'm out of the room");
        door.closeDoor();
    }

    public void getPenFromDesk(){
        desk.openDrawer(2);
        System.out.println("Got the pen!");
    }

    public void getSomeFreshAir(){
        window.getFreshAir();
    }

    public void searchDrawer(int drawer){
        desk.openDrawer(drawer);
    }
}
