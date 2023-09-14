package ru.morozevich.stateapp.model.entity;

import java.util.EnumSet;
import java.util.Set;

public enum State {
    STATE(Region.getAllRegions());

    private Set<Region> allRegions;
    private final City capital = City.CAPITAL_CITY;

    private State() {
    }

    private State(Set<Region> allRegions) {
        this.allRegions = allRegions;
    }

    public City getCapital() {
        return this.capital;
    }

    public Set<Region> getAllRegions() {
        return this.allRegions;
    }
}
