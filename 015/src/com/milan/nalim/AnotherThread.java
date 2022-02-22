package com.milan.nalim;

import static com.milan.nalim.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + Thread.currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.out.println(ANSI_BLUE + "Another thread woke me up");
            return;
        }

        System.out.println(ANSI_BLUE + "Three seconds have passed and I'm awake.");
    }
}
