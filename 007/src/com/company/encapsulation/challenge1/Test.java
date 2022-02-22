package com.company.encapsulation.challenge1;

public class Test {
    public static void main(String[] args) {
        Printer printer = new Printer(130, true);
        printer.printPages(400);
        printer.fillToner(55);

        System.out.println(printer.getNumberOfPrintedPages());
    }
}
