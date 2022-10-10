package org.studyeasy;

import java.util.ArrayList;

class intWrapper {
    public int intValue;

    public intWrapper(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}

public class App {

    public static void main(String[] args) {
        /*ArrayList<Integer> studentNumbers = new ArrayList<>();
        studentNumbers.add(25); // Autoboxing
        System.out.println(studentNumbers.get(0)); // Unboxing

        ArrayList<intWrapper> studentNumbers = new ArrayList<>();
        studentNumbers.add(new intWrapper(12)); // Boxing
        System.out.println(studentNumbers.get(0).getIntValue()); // Unboxing
        */

        ArrayList<Double> demoList = new ArrayList<>();
        //demoList.add(25.5);
        //demoList.add(new Double(25.2));
        demoList.add(Double.valueOf(10.0)); // This iss done while autoboxing
        //System.out.println(demoList.get(0));
        System.out.println(demoList.get(0).doubleValue()); // This is done while unboxing

    }
}
