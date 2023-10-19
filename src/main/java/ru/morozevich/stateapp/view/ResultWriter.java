package ru.morozevich.stateapp.view;

import ru.morozevich.stateapp.model.entity.Citizen;
import ru.morozevich.stateapp.model.entity.City;
import ru.morozevich.stateapp.model.entity.Region;
import ru.morozevich.stateapp.model.entity.State;

import java.util.ArrayList;

public class ResultWriter {
    public String printCitizens(ArrayList<Citizen> foundCitizen) {
        StringBuilder buffer = new StringBuilder();
        buffer.append("\n");
        for (Region region : State.getInstance().getRegions()) {
            buffer.append("Название региона: ")
                    .append(region)
                    .append("\n");
            for (Citizen citizen : foundCitizen) {
                if (citizen.getResidence().getDistrict().getRegion() == region) {
                    buffer.append("Житель: ")
                            .append(citizen)
                            .append("\n");
                }
            }
        }
        return buffer.toString();
    }
}
