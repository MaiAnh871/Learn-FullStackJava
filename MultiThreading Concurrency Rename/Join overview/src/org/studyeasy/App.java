package org.studyeasy;

public class App {
    public int counter = 0;

    public static void main(String[] args) {
        App app = new App();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    app.counter++;
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                for (int i = 0; i < 1000; i++) {
                    app.counter++;
                }
            }
        });
        thread2.start();
        thread1.start();

        /*
         * If thread 1 - thread 1 start then thread 2 - thread 2 start:
         * Result = 1000 cause thread1 and thread2 getting some small
         * of time before executing thiss particular line of code
         */

        /*
         * If thread 1, thread 2 then thread1 start and thread 2 start
         * Result = 0
         */
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The value of counter: " + app.counter);
    }
}
