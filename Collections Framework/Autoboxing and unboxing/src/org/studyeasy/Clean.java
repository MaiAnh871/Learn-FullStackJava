package org.studyeasy;

import java.util.ArrayList;

public class Clean {
    public static void main(String[] args) {
        ArrayList<Integer> demoListInteger = new ArrayList<>();
        demoListInteger.add(10);
        System.out.println(demoListInteger.get(0));

        ArrayList<Float> demoListFloat = new ArrayList<>();
        demoListFloat.add(12.0F);
        System.out.println(demoListFloat.get(0));
    }
}
