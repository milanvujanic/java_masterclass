package com.milan.java8newfeatures;

public class Main {

    public static void main(String[] args) {
	    BankAccount account = new BankAccount("12345-678", 1000.00);

        Thread trThread1 = new Thread(() -> {
            System.out.println("Client 1: depositing 300$");
            account.deposit(300.00);
            System.out.println("Client 1: withdrawing 50$");
            account.withdraw(50.00);
            account.printAccountNumber();
        });

        Thread trThread2 = new Thread(() -> {
            System.out.println("Client 2: depositing 203.75$");
            account.deposit(203.75);
            System.out.println("Client 2: withdrawing 100$");
            account.withdraw(100.00);
            account.printAccountNumber();
        });

        trThread1.start();
        trThread2.start();
    }
}
