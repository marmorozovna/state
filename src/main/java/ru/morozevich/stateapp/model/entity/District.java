package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.service.NameCreator;

import java.util.ArrayList;
import java.util.Random;

public class District {
    private Region region;
    private String name;
    private boolean isCapitalCenter;
    private boolean isRegionCenter;
    private ArrayList<City> cities = new ArrayList<>();
    private static ArrayList<City> allCities = new ArrayList<>();

    District(Region region, boolean isCapitalCenter, boolean isRegionCenter) {
        this.isCapitalCenter = isCapitalCenter;
        this.isRegionCenter = isRegionCenter;
        this.region = region;
        NameCreator nameCreator = new NameCreator();
        this.name = nameCreator.createName();
        Random random = new Random();
        if (isCapitalCenter) {
            City capitalCity = new City(this, true, true);
            cities.add(capitalCity);
            allCities.add(capitalCity);
        } else if (isRegionCenter) {
            City regionCenterCity = new City(this, true, false);
            cities.add(regionCenterCity);
            allCities.add(regionCenterCity);
        }
        int cityQuantity = random.nextInt(5, 11);
        for (int i = 0; i < cityQuantity; i++) {
            City city = new City(this, false, false);
            cities.add(city);
            allCities.add(city);
        }
    }

    public Region getRegion() {
        return this.region;
    }

    public static ArrayList<City> getAllCities() {
        return allCities;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
