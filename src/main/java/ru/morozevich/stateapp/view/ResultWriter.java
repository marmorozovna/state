package ru.morozevich.stateapp.view;

import ru.morozevich.stateapp.model.entity.Citizen;
import ru.morozevich.stateapp.model.entity.City;
import ru.morozevich.stateapp.model.entity.Region;
import ru.morozevich.stateapp.model.entity.State;

import java.util.ArrayList;

public class ResultWriter {
    public void printCitizens(ArrayList<Citizen> foundCitizen) {
        StringBuilder buffer = new StringBuilder();
        buffer.append("\n");
        for (Region region : State.getInstance().getRegions()) {
            buffer.append("Название региона: ")
                    .append(region)
                    .append("\n");
            for (Citizen citizen : foundCitizen) {
                if (citizen.getRegion() == region) {
                    buffer.append("Житель: ")
                            .append(citizen)
                            .append("\n");
                }
            }
        }
        System.out.println(buffer);
    }

    public void printCities(ArrayList<City> cities) {
        StringBuilder buffer = new StringBuilder();
        buffer.append("\n");
        for (Region region : State.getInstance().getRegions()) {
            buffer.append("Название региона: ")
                    .append(region)
                    .append("\n");
            for (City city : cities) {
                if (city.getDistrict().getRegion() == region) {
                    buffer.append("Областной центр: ")
                            .append(city)
                            .append("\n");
                }
            }
        }
        System.out.println(buffer);
    }
}
