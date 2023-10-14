package ru.morozevich.stateapp.model.entity;

import java.util.ArrayList;
import java.util.Random;

public class State {
    private static State instance;

    private City capital;

    private ArrayList<Region> regions = new ArrayList<>();

    private State() {
        Random random = new Random();
        int regionQuantity = random.nextInt(5, 11);
        for (int i = 0; i < regionQuantity + 1; i++) {
            Region region = new Region();
            regions.add(region);
        }
    }

    public static State getInstance() {
        if (instance == null) {
            instance = new State();
        }
        return instance;
    }
    private int square;

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

    public City getCapital() {
        return capital;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }
}
