package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.util.NameCreator;

import java.util.ArrayList;
import java.util.Random;

public class Region {

    private String name;

    private boolean isCapitalCenter;

    private ArrayList<District> districts = new ArrayList<>();

    Region(boolean isCapitalCenter) {
        this.isCapitalCenter = isCapitalCenter;
        NameCreator nameCreator = new NameCreator();
        this.name = nameCreator.createName();
        Random random = new Random();
        int districtQuantity = random.nextInt(5, 11);
        for (int i = 0; i < districtQuantity + 1; i++) {
            District district = new District(this);
            districts.add(district);
        }
    }

    public boolean isCapitalCenter() {
        return isCapitalCenter;
    }
}
