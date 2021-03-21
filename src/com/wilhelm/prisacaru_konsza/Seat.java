package com.wilhelm.prisacaru_konsza;

import java.util.Comparator;

public class Seat implements Comparable<Seat> {

    private final String seatNum;
    private boolean isReserved;
    private double price;
    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seatOne, Seat seatTwo) {
            if (seatOne.price < seatTwo.price) {
                return -1;
            } else if (seatOne.price > seatTwo.price) {
                return 1;
            } else
                return 0;

        }

    };

    public Seat(String seatNum, double price) {
        this.seatNum = seatNum;
        this.isReserved = false;
        this.price = price;
    }

    public Seat(String seatNum) {
        this.seatNum = seatNum;
        this.isReserved = false;
        this.price = 12.00;
    }

    @Override
    public String toString() {
        return " \n" + seatNum + " reserved: " + isReserved + " price: " + price;
    }

    public String getSeatNum() {
        return this.seatNum;
    }

    public boolean reserve() {
        if (!this.isReserved) {
            System.out.println("Seat " + seatNum + " reserved.");
            return this.isReserved = true;
        } else {
            System.out.println("Seat: " + seatNum + " is already reserved");
            return false;
        }
    }

    public boolean cancel() {
        if (this.isReserved) {
            this.isReserved = false;
            return true;
        } else {
            System.out.println("Seat: " + seatNum + " is not reserved");
            return false;
        }
    }


    @Override
    public int compareTo(Seat other) {
        return this.seatNum.compareTo(other.getSeatNum());
    }

}
