package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.util.NameCreator;

public class District {
    private Region region;
    private boolean isRegionCenter;
    private String name;

    District(Region region) {
        this.region = region;
    }

    District(Region region, boolean isRegionCenter) {
        this(region);
        this.isRegionCenter = isRegionCenter;
    }

    District(Region region, boolean isRegionCenter, String name) {
        this(region, isRegionCenter);
        NameCreator nameCreator = new NameCreator();
        this.name = nameCreator.createName();
    }

    public Region getRegion() {
        return this.region;
    }

    public boolean isRegionCenter() {
        return isRegionCenter;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
