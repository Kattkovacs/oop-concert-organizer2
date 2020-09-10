package com.codecool.concert.organizer.band;

public class Band {

    private final String name;
    private final Style style;

    public Band(String name, Style style) {
        this.name = name;
        this.style = style;
    }

    public void decideWarmUpBand(){};
}
