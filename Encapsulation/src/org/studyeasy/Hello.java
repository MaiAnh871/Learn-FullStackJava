package org.studyeasy;

public class Hello {

    public static void main(String[] args) {
        Person pooja = new Person("Pooja", 26, "Female");
        System.out.println(pooja);
        pooja.setAge(-30);
        System.out.println(pooja);
    }
}
