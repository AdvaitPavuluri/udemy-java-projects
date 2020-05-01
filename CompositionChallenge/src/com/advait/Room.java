package com.advait;

public class Room {

    private String wallColor;
    private String dimensions;
    private String name;
    private String bedBrand;
    private String deskBrand;
    private String lightBulbType;

    public void openDoor(int time, int sound) {
        System.out.println("Entering " + name + " now.");
        System.out.println("The door was opened in " + time + " seconds at" + sound + "decibels.");
    }

}
