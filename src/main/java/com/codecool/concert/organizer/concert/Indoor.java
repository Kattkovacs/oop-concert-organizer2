package com.codecool.concert.organizer.concert;

import com.codecool.concert.organizer.band.Band;

public class Indoor extends Concert {

    public static final int CAPACITY = 3000;
    public static final int DURATION_IN_MINUTES = 90;
    public static final int TICKET_PRICE = 12000;
    public static final int BEER_PRICE = 600;

    public Indoor(Band mainBand) {
        super(mainBand, CAPACITY, DURATION_IN_MINUTES, TICKET_PRICE, BEER_PRICE);
    }
}
