package com.codecool.concert.organizer;

import com.codecool.concert.organizer.band.Band;
import com.codecool.concert.organizer.concert.Concert;



import java.util.HashSet;
import java.util.Set;

public class ConcertOrganizer {

    private Set<Band> bands = new HashSet<>();
    private Set<Concert> concerts = new HashSet<>();

    public void registerBand(Band band) {
        bands.add(band);
    }

    public void registerConcert(Concert concert) {
        concerts.add(concert);
    }


    public int countProfit(int numberOfConcerts) {
        return 0;
    }
}
