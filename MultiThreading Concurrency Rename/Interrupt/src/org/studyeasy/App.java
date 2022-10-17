package org.studyeasy;


public class App {
    static public int balance = 5000;

    public void withdraw(int amount) {
        synchronized (this) { // App Object
            if (balance <= 0 || balance < amount) {
                try {
                    System.out.println("Waiting for balance updation");
                    wait();
                    // Should be inside a synchronized method or block
                } catch (InterruptedException e) {
                    System.out.println("Original balance: " + balance);
                    System.out.println("Withdraw amount: " + amount);
                    balance -= amount;
                    System.out.println("Withdraw successful and the current balance is: " + balance);

                }
            }
            else {
                System.out.println("We are inside else");
            }
        }
        /*
        balance -= amount;
        System.out.println("Withdraw sucess!");

         */
    }


    public void deposit(int amount) {
        System.out.println("We are deposting the amount " + amount);
        balance += amount;
        /*
        synchronized (this) {
            notify(); // SHould be in synchronized method
        }
         */
    }


    // What happens if a thread depends on another thread?
    public static void main(String[] args) {
        App app = new App();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                app.withdraw(1000);
            }
        });
        thread1.setName("Thread1");
        thread1.start();
        /*
        if (balance <= 0) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            thread.interrupt();
        }
*/

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                app.deposit(2000);
                thread1.interrupt();
            }
        });
        thread2.setName("Thread2");
        thread2.start();

    }
}
