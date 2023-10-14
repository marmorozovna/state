package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.util.NameCreator;

import java.util.ArrayList;
import java.util.Random;

public class District {
    private Region region;
    private String name;
    private ArrayList<City> cities = new ArrayList<>();

    District(Region region) {
        this.region = region;
        NameCreator nameCreator = new NameCreator();
        this.name = nameCreator.createName();
        Random random = new Random();
        if (region.isCapitalCenter()){
            City capitalCity = new City(this, true,true);
            cities.add(capitalCity);
        } else {
            City regionCenterCity = new City(this, true,false);
            cities.add(regionCenterCity);
        }
        int cityQuantity = random.nextInt(5, 11);
        for (int i = 0; i < cityQuantity; i++) {
            City city = new City(this, false,false);
            cities.add(city);
        }
    }

    public Region getRegion() {
        return this.region;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
