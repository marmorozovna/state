package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.service.CitizenCreator;

import java.util.HashSet;

public enum State {
    STATE();

    private final City capital = City.CAPITAL_CITY;
    private final HashSet<Citizen> stateCitizen = CitizenCreator.createCitizen(500);

    private final int square = 357592;

    State() {
    }

    public City getCapital() {
        return this.capital;
    }

    public HashSet<Citizen> getStateCitizen() {
        return this.stateCitizen;
    }

    public int getSquare() {
        return square;
    }
}
