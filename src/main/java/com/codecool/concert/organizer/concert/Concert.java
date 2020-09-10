package com.codecool.concert.organizer.concert;

import com.codecool.concert.organizer.band.Band;

public abstract class Concert {
    private Band mainBand;
    private Band warmUpBand;
    private final int capacity;
    private final int durationInMinutes;
    private final int ticketPrice;
    private final int beerPrice;

    public Concert(Band mainBand, int capacity, int durationInMinutes,
                   int ticketPrice, int beerPrice) {
        this.mainBand = mainBand;
        this.capacity = capacity;
        this.durationInMinutes = durationInMinutes;
        this.ticketPrice = ticketPrice;
        this.beerPrice = beerPrice;
    }

    public abstract boolean isFullHouse();

    public abstract double calculateBarIncome();

    public abstract double calculateTicketIncome();
}
