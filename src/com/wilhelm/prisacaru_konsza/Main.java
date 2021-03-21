package com.wilhelm.prisacaru_konsza;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Tamási Áron", 2, 14);
        System.out.println(theatre.getSeatList());
        List<Seat> shallowListCopy = new ArrayList<>(theatre.getSeatList());

//        System.out.println("========================================");
//        theatre.reserveSeat("B10");
//        System.out.println(shallowListCopy);
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        System.out.println(theatre.getSeatList());
//        Collections.reverse(shallowListCopy);
//        System.out.println("*****************************************");
//        System.out.println(shallowListCopy);
//        System.out.println(theatre.getSeatList());

        Theatre theatreComparatorTest = new Theatre("Test", 5, 14);
        //System.out.println(theatreComparatorTest.getSeatList());
        Collections.shuffle(theatreComparatorTest.getSeatList());
        System.out.println(theatreComparatorTest.getSeatList());
        Collections.sort(theatreComparatorTest.getSeatList(), Seat.PRICE_ORDER);
        System.out.println(theatreComparatorTest.getSeatList());
        



    }
}
