package org.studyeasy;

import java.util.concurrent.CountDownLatch;

class SomeThread extends Thread {
    private CountDownLatch countDownLatch;

    public SomeThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Thread running with thread name: " + Thread.currentThread().getName());
        System.out.println("Thread execution completed");
        System.out.println("*************************");
        countDownLatch.countDown();
        // Unfold the latch for 1 time
    }
}

public class App {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        SomeThread thread1 = new SomeThread(countDownLatch);
        SomeThread thread2 = new SomeThread(countDownLatch);
        SomeThread thread3 = new SomeThread(countDownLatch);
        SomeThread thread4 = new SomeThread(countDownLatch);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // It will force the main thread to wait until the lock is released
        System.out.println("I am in main thread " + Thread.currentThread().getName());


    }
}
