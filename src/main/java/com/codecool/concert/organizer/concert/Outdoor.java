package com.codecool.concert.organizer.concert;

import com.codecool.concert.organizer.band.Band;

public class Outdoor extends Concert {

    public static final int CAPACITY = 5000;
    public static final int DURATION_IN_MINUTES = 120;
    public static final int TICKET_PRICE = 14000;
    public static final int BEER_PRICE = 800;
    private static final int CHANCE_OF_RAIN = 30;

    public Outdoor(Band mainBand) {
        super(mainBand, CAPACITY, DURATION_IN_MINUTES, TICKET_PRICE, BEER_PRICE);
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
