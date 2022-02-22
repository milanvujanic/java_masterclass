package com.milan.nalim;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

import static com.milan.nalim.Main.EOF;
import static com.milan.nalim.ThreadColor.*;

public class Main {
    public static final String EOF = "EOF";

    public static void main(String[] args) {
	    List<String> buffer = new ArrayList<>();
        ReentrantLock bufferLock = new ReentrantLock();

        MyProducer producer = new MyProducer(buffer, ANSI_YELLOW, bufferLock);
        MyConsumer consumer1 = new MyConsumer(buffer, ANSI_PURPLE, bufferLock);
        MyConsumer consumer2 = new MyConsumer(buffer, ANSI_CYAN, bufferLock);

        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();

    }
}

class MyProducer implements Runnable {

    private List<String> buffer;
    private String color;
    private ReentrantLock bufferLock;

    public MyProducer(List<String> buffer, String color, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.color = color;
        this.bufferLock = bufferLock;
    }

    @Override
    public void run() {
        String[] numbers = {"1", "2", "3", "4", "5"};
        Random random = new Random();

        for (String number : numbers) {
            try {
                System.out.println(color + "Adding " + number + " to the buffer.");
                bufferLock.lock();
                try {
                    buffer.add(number);
                } finally {
                    bufferLock.unlock();
                }

                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException ie) {
                System.out.println(color + "Producer was interrupted");
            }
        }
        System.out.println(color + "Adding eof and exiting...");
        bufferLock.lock();
        try {
            buffer.add(EOF);
        } finally {
            bufferLock.unlock();
        }
    }
}

class MyConsumer implements Runnable {
     private List<String> buffer;
     private String color;
     private ReentrantLock bufferLock;

    public MyConsumer(List<String> buffer, String color, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.color = color;
        this.bufferLock = bufferLock;
    }

    @Override
    public void run() {
        Random random = new Random();
        int counter = 0;

        while (true) {
            if (bufferLock.tryLock()) {
                try {
                    if (buffer.isEmpty()) {
                        continue;
                    }
                    System.out.println(color + "The counter: " + counter);
                    counter = 0;
                    if (buffer.get(0).equals(EOF)) {
                        System.out.println(color + "End of file, exiting");
                        break;
                    } else {
                        System.out.println(color + "Removed " + buffer.remove(0) + " from file");
                    }
                } finally {
                    bufferLock.unlock();
                }
            } else {
                counter++;
            }
        }
    }
}


































