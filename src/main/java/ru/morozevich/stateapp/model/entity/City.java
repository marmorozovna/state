package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.service.NameCreator;

import java.util.ArrayList;
import java.util.Random;

public class City {

    private final District district;
    private boolean isRegionCenter;
    private boolean isCapital;
    private final String name;
    private static ArrayList<Citizen> allCitizens = new ArrayList<>();

    City(District district, boolean isRegionCenter, boolean isCapital) {
        this.district = district;
        this.isRegionCenter = isRegionCenter;
        this.isCapital = isCapital;
        NameCreator nameCreator = new NameCreator();
        this.name = nameCreator.createName();
        Random random = new Random();
        int citizenQuantity = random.nextInt(1, 51);
        for (int i = 0; i < citizenQuantity; i++) {
            Citizen citizen = new Citizen(this);
            allCitizens.add(citizen);
        }
    }

    public District getDistrict() {
        return district;
    }

    public static ArrayList<Citizen> getAllCitizens() {
        return allCitizens;
    }

    public boolean isCapital() {
        return this.isCapital;
    }

    public boolean isRegionCenter() {
        return this.isRegionCenter;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

