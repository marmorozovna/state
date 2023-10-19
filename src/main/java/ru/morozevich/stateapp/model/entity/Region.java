package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.service.NameCreator;

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
        if (isCapitalCenter) {
            District capitalDistrict = new District(this, true, true);
            districts.add(capitalDistrict);
        } else {
            District regionCenterDistrict = new District(this, false, true);
            districts.add(regionCenterDistrict);
        }
        for (int i = 0; i < districtQuantity; i++) {
            District otherDistrict = new District(this, false, false);
            districts.add(otherDistrict);
        }
    }

    public boolean isCapitalCenter() {
        return isCapitalCenter;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
