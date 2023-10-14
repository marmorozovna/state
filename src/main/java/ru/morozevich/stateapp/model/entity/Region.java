package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.service.RegionCreator;

import java.util.EnumSet;
import java.util.Set;

public enum Region {
    CAPITAL_REGION(State.STATE, RegionCreator.createName()),
    INDUSTRIAL_REGION(State.STATE, RegionCreator.createName()),
    SEESIDE_REGION(State.STATE, RegionCreator.createName()),
    RURAL_REGION(State.STATE, RegionCreator.createName()),
    ANCIENT_REGION(State.STATE, RegionCreator.createName());

    private final State state;

    private final String name;

    private Region(State state, String name) {
        this.state = state;
        this.name = name;
    }

    public static Set<Region> getAllRegions() {
        return EnumSet.allOf(Region.class);
    }

    public State getState() {
        return this.state;
    }

    public String toString() {
        return this.name;
    }
}
