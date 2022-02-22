package com.milan.collections;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> copy = new ArrayList<>(theatre.seats);
        printSeats(copy);
    }

    public static void printSeats(List<Theatre.Seat> seats) {
        for (Theatre.Seat seat : seats) {
            System.out.print(seat.getSeatNumber() + " ");
        }
        System.out.println();
        System.out.println("=======================================================");
    }
}
