package com.milan.nalim;

import java.util.Random;

import static com.milan.nalim.Main.EOF;

public class Main {

    public static final String EOF = "Finished";

    public static void main(String[] args) {
	    Message message = new Message();

        new Thread(new Writer(message)).start();
        new Thread(new Reader(message)).start();
    }
}

class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException ie) {

            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void write(String message) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException ie) {

            }
        }
        empty = false;
        this.message = message;
        notifyAll();
    }
}

class Writer implements Runnable {

    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Random random = new Random();

        String[] messages = {
            "Humpty Dumpty sat on a wall",
            "Humpty Dumpty had a great fall",
            "All of king's horses and all of king's men",
            "Couldn't put Humpty together again"
        };

        for (int i = 0; i < messages.length; i++) {
            message.write(messages[i]);

            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException ie) {

            }
        }
        message.write(EOF);
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (String msg = message.read(); !msg.equals(EOF); msg = message.read()) {
            System.out.println(msg);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException ie) {

            }
        }

        System.out.println(EOF);
    }
}


















































