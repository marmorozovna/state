package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.service.CitizenCreator;

import java.util.HashSet;

public enum State {
    STATE();

    private final City capital = City.CAPITAL_CITY;
    private HashSet<Citizen> stateCitizen = CitizenCreator.createCitizen(100);

    private final int square = 357592;

    private State() {
    }

    public City getCapital() {
        return this.capital;
    }

    private State(HashSet<Citizen> stateCitizen) {
        this.stateCitizen = stateCitizen;
    }

    public HashSet<Citizen> getStateCitizen() {
        return this.stateCitizen;
    }

    public int getSquare() {
        return square;
    }
}
