package org.studyeasy;

class Brakets {
    // This lock is specific to object
    synchronized public void generate() {
        for (int i = 1; i <= 10; i++) {
            if (i <= 5) {
                System.out.print("[");
            }
            else {
                System.out.print("]");
            }
        }
        System.out.println();
    }
}

public class App {

    public static void main(String[] args) {
        Brakets braket1 = new Brakets();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    braket1.generate();
                }
            }
        }).start();

        Brakets braket2 = new Brakets();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    braket2.generate();
                }
            }
        }).start();
    }
}
