package com.milan.nalim;

import static com.milan.nalim.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from myRunnable's implementation of run()");
    }
}
