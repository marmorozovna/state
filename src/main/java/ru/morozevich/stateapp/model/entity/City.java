package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.util.NameCreator;

import java.util.ArrayList;
import java.util.Random;

public class City {

    private final District district;

    private boolean isDistrictCenter;

    private boolean isCapital;

    private final String name;

    private ArrayList <Citizen> citizens = new ArrayList<>();

    private static ArrayList <Citizen> allCitizens = new ArrayList<>();

    City(District district, boolean isDistrictCenter,boolean isCapital) {
        this.district = district;
        NameCreator nameCreator = new NameCreator();
        this.name = nameCreator.createName();
        Random random = new Random();
        int citizenQuantity = random.nextInt(1, 51);
        for (int i = 0; i < citizenQuantity + 1; i++) {
        Citizen citizen = new Citizen(this);
            citizens.add(citizen);
            citizens.add(citizen);
        }
    }

    public District getDistrict() {
        return district;
    }

    public static ArrayList<Citizen> getAllCitizens() {
        return allCitizens;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

