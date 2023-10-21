package ru.morozevich.stateapp.model.entity;

import java.util.ArrayList;
import java.util.Random;

public class State {
    private static State instance;
    private int square;
    private ArrayList<Region> regions = new ArrayList<>();

    private State() {
        Random random = new Random();
        int regionQuantity = random.nextInt(5, 11);
        Region capitalRegion = new Region(true);
        regions.add(capitalRegion);
        for (int i = 0; i < regionQuantity; i++) {
            Region otherRegion = new Region(false);
            regions.add(otherRegion);

        }
    }

    public static State getInstance() {
        if (instance == null) {
            instance = new State();
        }
        return instance;
    }

    public int getSquare() {
        if (square == 0) {
            this.setSquare();
        }
        return square;
    }

    private void setSquare() {
        Random random = new Random();
        this.square = random.nextInt(44, 1700);
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public ArrayList<Citizen> getAllCitizens() {
        return City.getAllCitizens();
    }
}
