package ru.morozevich.stateapp.model.service;

import ru.morozevich.stateapp.model.entity.City;
import ru.morozevich.stateapp.model.entity.District;
import ru.morozevich.stateapp.model.entity.State;

import java.util.ArrayList;

public class CityService {

    public City findCapital() {
        State.getInstance();
        City capital = null;
        for (int cityIndex = 0; cityIndex < District.getAllCities().size(); cityIndex++) {
            if (District.getAllCities().get(cityIndex).isCapital()) {
                capital = District.getAllCities().get(cityIndex);
            }
        }
        return capital;
    }

    public ArrayList<City> findRegionCentres() {
        State.getInstance();
        ArrayList<City> regionCenters = new ArrayList<>();
        for (int cityIndex = 0; cityIndex < District.getAllCities().size(); cityIndex++) {
            if (District.getAllCities().get(cityIndex).isRegionCenter()) {
                regionCenters.add(District.getAllCities().get(cityIndex));
            }
        }
        return regionCenters;
    }
}
