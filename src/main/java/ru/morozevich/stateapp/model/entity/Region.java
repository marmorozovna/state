package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.service.NameCreator;

import java.util.Random;

public class Region {

    private String name;
    private boolean isCapitalCenter;

    Region(boolean isCapitalCenter) {
        this.isCapitalCenter = isCapitalCenter;
        NameCreator nameCreator = new NameCreator();
        this.name = nameCreator.createName();
        Random random = new Random();
        int districtQuantity = random.nextInt(5, 11);
        if (isCapitalCenter) {
            District capitalDistrict = new District(this, true, true);
        } else {
            District regionCenterDistrict = new District(this, false, true);
        }
        for (int i = 0; i < districtQuantity; i++) {
            District otherDistrict = new District(this, false, false);
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
