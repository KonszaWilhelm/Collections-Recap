package com.wilhelm.prisacaru_konsza;

import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seatList;

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        this.seatList = new ArrayList<>();

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum < seatsPerRow; seatNum++) {
                double price = 12.00;
                if (row < 'D' && seatNum >= 4 && seatNum <= 9) {
                    price = 14.00;
                } else if ((row > 'F') || (seatNum < 4 || seatNum > 9)) {
                    price = 7;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seatList.add(seat);
            }
        }
    }

    public List<Seat> getSeatList() {
        return this.seatList;
    }

    public String getTheatreName() {
        return this.theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seatList, requestedSeat, null);
        if (foundSeat >= 0) {
            return seatList.get(foundSeat).reserve();
        } else
            System.out.println("There is no seat " + seatNumber);
        return false;
//        for (Seat seat : seatList) {
//            System.out.print(".");
//            if (seat.getSeatNum().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if (requestedSeat == null) {
//            System.out.println("There is no seat: " + seatNumber);
//            return false;
//
//
//        }
//        return requestedSeat.reserve();
    }


}
