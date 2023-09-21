package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.service.CitizenCreator;

import java.util.ArrayList;

public enum State {
    STATE();

    private final City capital = City.CAPITAL_CITY;
    private final ArrayList<Citizen> stateCitizen = CitizenCreator.createCitizen(500);

    private final int square = 357592;

    State() {
    }

    public City getCapital() {
        return this.capital;
    }

    public ArrayList<Citizen> getStateCitizen() {
        return this.stateCitizen;
    }

    public int getSquare() {
        return square;
    }
}
