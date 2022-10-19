package org.studyeasy;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App {
    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                /*
                synchronized (lock1) {
                    System.out.println("Inside thread1 on lock1");
                    synchronized (lock2) {
                        System.out.println("Inside thread1 on lock2");
                    }
                }

                System.out.println("Inside thread 1");
                 */
                boolean flagLock1 = false;
                boolean flagLock2 = false;
                boolean doneFlag1 = false;
                boolean doneFlag2 = false;

                while (true) {
                    try {
                        if (!flagLock1) {
                            flagLock1 = lock1.tryLock();
                        }
                        if (!flagLock2) {
                            flagLock2 = lock2.tryLock();
                        }


                    }
                    /*
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                     */
                    finally {
                        if (flagLock1 && !doneFlag1) {
                            System.out.println("Inside thread 1 on lock 1");
                            lock1.unlock();
                            doneFlag1 = true;
                        }
                        if (flagLock2 && !doneFlag2) {
                            System.out.println("Inside thread 1 on lock 2");
                            lock2.unlock();
                            doneFlag2 = true;

                        }
                        if (flagLock1 && flagLock2) {
                            break;

                        }
                    }
                }


                //System.out.println("Inside thread 1 on lock 1");
                //System.out.println("Inside thread 1 on lock 2");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                /*
                synchronized (lock2) {
                    System.out.println("Inside thread2 on lock 2");
                    synchronized (lock1) {
                        System.out.println("Inside thread2 on lock 1");
                    }
                }

                System.out.println("Inside thread 2");

                lock1.lock();
                System.out.println("Inside thread 2 on lock 2");
                lock2.lock();
                System.out.println("Inside thread 2 on lock 1");
                lock2.unlock();
                lock1.unlock();

                 */

                boolean flagLock1 = false;
                boolean flagLock2 = false;

                while (true) {
                    try {
                        if (!flagLock1) {
                            flagLock1 = lock1.tryLock();
                        }
                        if (!flagLock2) {
                            flagLock2 = lock2.tryLock();
                        }
                    }
                    /*
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                     */
                    finally {
                        if (flagLock1) {
                            System.out.println("Inside thread 2 on lock 1");
                            lock1.unlock();
                        }
                        if (flagLock2) {
                            System.out.println("Inside thread 2 on lock 2");
                            lock2.unlock();
                        }
                        if (flagLock1 && flagLock2) {
                            break;
                        }
                    }
                }
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Inside main thread");
    }
}
