package ru.morozevich.stateapp.model.entity;

import java.util.Set;

public enum State {
    STATE();

    private final City capital = City.CAPITAL_CITY;

    private State() {
    }

    public City getCapital() {
        return this.capital;
    }

}
