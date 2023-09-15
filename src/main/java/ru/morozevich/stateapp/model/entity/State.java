package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.service.CitizenCreator;

import java.util.HashSet;

public enum State {
    STATE();

    private final City capital = City.CAPITAL_CITY;
    private HashSet<Citizen> stateCitizen = CitizenCreator.createCitizen(10);

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
}
