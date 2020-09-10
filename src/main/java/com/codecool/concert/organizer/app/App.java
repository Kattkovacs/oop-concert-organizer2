package com.codecool.concert.organizer.app;


import com.codecool.concert.organizer.ConcertOrganizer;
import com.codecool.concert.organizer.band.Band;
import com.codecool.concert.organizer.band.Style;
import com.codecool.concert.organizer.concert.Concert;
import com.codecool.concert.organizer.concert.Festival;
import com.codecool.concert.organizer.concert.Indoor;
import com.codecool.concert.organizer.concert.Outdoor;

public class App
{
    public static void main( String[] args )
    {
        ConcertOrganizer concertOrganizer = new ConcertOrganizer();
        Band band = new Band("Coma", Style.ROCK);
        concertOrganizer.registerBand(band);
        Concert concert = new Indoor(band);
        Concert outdoorConcert = new Outdoor(band);
        Concert festivalConcert = new Festival(band);
        concertOrganizer.registerConcert(concert);
        concertOrganizer.registerConcert(outdoorConcert);


        concertOrganizer.countProfit(10);
    }
}
