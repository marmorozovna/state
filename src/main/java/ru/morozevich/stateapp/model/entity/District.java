package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.util.NameCreator;

import java.util.ArrayList;
import java.util.Random;

public class District {
    private Region region;
    private boolean isRegionCenter;
    private String name;
    private ArrayList<City> cities = new ArrayList<>();

    District(Region region) {
        this.region = region;
        NameCreator nameCreator = new NameCreator();
        this.name = nameCreator.createName();
        Random random = new Random();
        int cityQuantity = random.nextInt(5, 11);
        for (int i = 0; i < cityQuantity + 1; i++) {
            City city = new City(this);
            cities.add(city);
        }
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
