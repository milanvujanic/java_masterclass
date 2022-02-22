package com.company.composition;

import com.sun.java.swing.plaf.motif.MotifEditorPaneUI;

public class Test {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27 inch beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("220", "Asus", 4, 6, "version 2.44");

        PC pc = new PC(theCase, motherboard, monitor);
        pc.powerUp();
    }
}
