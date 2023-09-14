package ru.morozevich.stateapp.model.entity;

import java.util.EnumSet;
import java.util.Set;

public enum Region {
    CAPITAL_REGION (State.STATE),
    INDUSTRIAL_REGION (State.STATE),
    SEESIDE_REGION (State.STATE),
    RURAL_REGION (State.STATE),
    ANCIENT_REGION (State.STATE);

    private State state;

    private Region() {
    }

    private Region(State state) {
        this.state = state;
    }

    public static Set<Region> getAllRegions() {
        return EnumSet.allOf(Region.class);
    }

    public State getState (){
        return this.state;
    }
}
