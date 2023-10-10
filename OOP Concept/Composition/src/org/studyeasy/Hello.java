package org.studyeasy;

import org.studyeasy.laptop.Laptop;
import org.studyeasy.laptop.components.GraphicsCard;
import org.studyeasy.laptop.components.Processor;

public class Hello {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        System.out.println(laptop.getProcessor().getBrand());

        Processor processor = new Processor("intel", "7200U", 7, 4, 4, "6MB", "2.56GHz", "2.5GHz", "3.16GHz");
        GraphicsCard graphicsCard = new GraphicsCard("NVDIA", 1050, "4GB");

        Laptop gamingLaptop = new Laptop(17f, processor, "DDR4", "2TB", graphicsCard, null, "backlit");
        System.out.println(gamingLaptop);
        gamingLaptop.gamingMode();

        System.out.println("Gaming mode on!");
        System.out.println(gamingLaptop.getProcessor().getFrequency());
    }
}
