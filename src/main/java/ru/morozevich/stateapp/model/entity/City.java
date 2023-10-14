package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.util.NameCreator;

public class City {
    private final District district;

    private boolean isDistrictCenter;

    private boolean isCapital;

    private String name;

    City(District district) {
        this.district = district;
    }

    City(District district, String name) {
        this(district);
        NameCreator nameCreator = new NameCreator();
        this.name = nameCreator.createName();
    }

    City(District district, String name, boolean isDistrictCenter) {
        this(district, name);
        this.isDistrictCenter = isDistrictCenter;
    }

    City(District district, String name, boolean isDistrictCenter, boolean isCapital) {
        this(district, name, isDistrictCenter);
        this.isCapital = isCapital;
    }

    public District getDistrict() {
        return district;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

