package com.codecool.concert.organizer.concert;

import com.codecool.concert.organizer.band.Band;

public class Festival extends Concert {

    public static final int BEER_PRICE = 1000;
    public static final int TICKET_PRICE = 15000;
    public static final int DURATION_IN_MINUTES = 360;
    public static final int CAPACITY = 8000;

    public Festival(Band band) {
        super(band, CAPACITY, DURATION_IN_MINUTES, TICKET_PRICE, BEER_PRICE);
    }

    @Override
    public boolean isFullHouse() {
        return false;
    }

    @Override
    public double calculateBarIncome() {
        return 0;
    }

    @Override
    public double calculateTicketIncome() {
        return 0;
    }
}
