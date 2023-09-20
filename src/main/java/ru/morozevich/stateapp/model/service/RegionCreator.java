package ru.morozevich.stateapp.model.service;

import ru.morozevich.stateapp.model.util.NameCreator;

public class RegionCreator {

    public static String createName() {
        NameCreator nameCreator = new NameCreator();
        return nameCreator.createName(65, 90);
    }
}
