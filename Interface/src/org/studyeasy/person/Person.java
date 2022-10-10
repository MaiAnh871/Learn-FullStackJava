package org.studyeasy.person;

public abstract class Person implements IsAlive, LiveLife {
    public void speak() {
        System.out.println("Shares his/her thoughts");
    }

    public abstract void eat();

    public void breathe() {
        System.out.println("be alive; remain living.");
    }

    public void message() {
        System.out.println("life is journey");

    }
}
