package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.service.RegionCreator;
import ru.morozevich.stateapp.model.util.NameCreator;

import java.util.EnumSet;
import java.util.Set;

public class Region {
    private final State state;

    private final String name;

    private Region(String name) {
        this.state = State.getInstance();
        NameCreator nameCreator = new NameCreator();
        this.name = nameCreator.createName();
    }

    public State getState() {
        return this.state;
    }

    public String toString() {
        return this.name;
    }
}
