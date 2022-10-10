package org.studyeasy;

public class App {

    public static void main(String[] args) {
        int x = 0;
        int y = 5;
        try {
            System.out.println("The statement will get executed");
            y = (10*10)/0;
            System.out.println("The statement will not get executed");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Inside exception block!");
        }

    }

    public void case1(int x, int y) {
        if (y!=0) {
            System.out.println(x / y);
        }
        else {
            System.out.println("Value of y is 0");
        }
    }

    public void case2(int x, int y) {
        try {
            System.out.println(x / y);
        }
        catch (Exception e) {
            System.out.println("Value of y is 0");
        }
    }
}
