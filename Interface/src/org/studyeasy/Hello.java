package org.studyeasy;

import org.studyeasy.person.NonVegan;
import org.studyeasy.person.Person;
import org.studyeasy.person.Vegan;
import org.studyeasy.phone.Iphone8;
import org.studyeasy.phone.OnePlus5;
import org.studyeasy.phone.Phone;

public class Hello {

    public static void main(String[] args) {
        Person john = new Vegan();
        john.speak();
        john.eat();
        john.breathe();
        john.message();
        System.out.println("**************");
        Person mia = new NonVegan();
        mia.speak();
        mia.eat();
        mia.breathe();
        mia.message();
    }
}
