package org.studyeasy;

import org.studyeasy.shop.Door;

public class Shop {
    public static void main(String[] args) {
        Door door = new Door();
        if (door.getLock().isUnlocked("qwerty")) {
            System.out.println("Welcome");
        }
        else
        {
            System.out.println("Closed");
        }
    }
}
