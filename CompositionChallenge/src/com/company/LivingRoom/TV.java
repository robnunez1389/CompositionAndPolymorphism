package com.company.LivingRoom;

public class TV {
    private String brand;
    private int screenSize;

    public TV(String brand, int screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    // Private method to handle small task within larger method.
    private void getCredentials(){
        System.out.println("Searching...");
    }

    public String getBrand() {
        getCredentials();
        return brand;
    }

    public int getScreenSize() {
        getCredentials();
        return screenSize;
    }
}
