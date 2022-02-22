package com.milan.nalim;

import static com.milan.nalim.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the Main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("===Another thread===");
        anotherThread.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from annonymous thread.");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the annonymous's class implementation of run()");
                try {
                    anotherThread.join();
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all, I was interrupted.");
                }
                System.out.println(ANSI_RED + "AnotherThread terminated or timed out, so I'm running again.");
            }
        });
        myRunnableThread.start();
        System.out.println(ANSI_PURPLE + "Hello again from the Main thread");
    }
}
