package org.studyeasy;

import org.studyeasy.laptop.Laptop;
import org.studyeasy.laptop.components.Processor;

public class Hello {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        System.out.println(laptop.getProcessor().getBrand());

        Laptop gamingLaptop = new Laptop(17f, new Processor())
    }
}
