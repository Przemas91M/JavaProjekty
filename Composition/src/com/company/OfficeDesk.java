package com.company;

public class OfficeDesk {
    private String color;
    private String material;
    private int height;
    private int drawers;

    public OfficeDesk(String color, String material, int height, int drawers) {
        this.color = color;
        this.material = material;
        this.height = height;
        this.drawers = drawers;
    }

    public void openDrawer(int drawer){
        if(drawer < 0 || drawer > drawers)
        {
            System.out.println("This desk doesn't have this drawer");
            return;
        }
        System.out.println("Opening drawer number: " + drawer);
    }

    public void closeDrawer(int drawer){
        if(drawer < 0 || drawer > drawers)
        {
            System.out.println("This desk doesn't have this drawer");
            return;
        }
        System.out.println("Closing drawer number: " + drawer);
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public int getHeight() {
        return height;
    }

    public int getDrawers() {
        return drawers;
    }
}
