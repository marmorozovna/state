package ru.morozevich.stateapp.view;

import ru.morozevich.stateapp.model.entity.Citizen;
import ru.morozevich.stateapp.model.entity.Region;

import java.util.ArrayList;
import java.util.HashSet;

public class Output {
    public static String formatList(ArrayList<Citizen> citizenArrayList) {
        StringBuilder buffer = new StringBuilder();
        HashSet<Citizen> citizenCapitalRegion = new HashSet<>();
        HashSet<Citizen> citizenIndustrialRegion = new HashSet<>();
        HashSet<Citizen> citizenSeasideRegion = new HashSet<>();
        HashSet<Citizen> citizenRuralRegion = new HashSet<>();
        HashSet<Citizen> citizenAncientRegion = new HashSet<>();
        for (Citizen citizen : citizenArrayList) {
            switch (citizen.getResidence().getDistrict().getRegion()) {
                case CAPITAL_REGION -> citizenCapitalRegion.add(citizen);
                case RURAL_REGION -> citizenRuralRegion.add(citizen);
                case ANCIENT_REGION -> citizenAncientRegion.add(citizen);
                case SEESIDE_REGION -> citizenSeasideRegion.add(citizen);
                case INDUSTRIAL_REGION -> citizenIndustrialRegion.add(citizen);
            }
        }
        buffer.append("Название региона: ");
        buffer.append(Region.CAPITAL_REGION);
        buffer.append("\n");
        for (Citizen citizen : citizenCapitalRegion) {
            buffer.append(citizen.toString());
            buffer.append("\n");
        }
        buffer.append("Название региона: ");
        buffer.append(Region.INDUSTRIAL_REGION);
        buffer.append("\n");
        for (Citizen citizen : citizenIndustrialRegion) {
            buffer.append(citizen.toString());
            buffer.append("\n");
        }
        buffer.append("Название региона: ");
        buffer.append(Region.SEESIDE_REGION);
        buffer.append("\n");
        for (Citizen citizen : citizenSeasideRegion) {
            buffer.append(citizen.toString());
            buffer.append("\n");
        }
        buffer.append("Название региона: ");
        buffer.append(Region.RURAL_REGION);
        buffer.append("\n");
        for (Citizen citizen : citizenRuralRegion) {
            buffer.append(citizen.toString());
            buffer.append("\n");
        }
        buffer.append("Название региона: ");
        buffer.append(Region.ANCIENT_REGION);
        buffer.append("\n");
        for (Citizen citizen : citizenAncientRegion) {
            buffer.append(citizen.toString());
            buffer.append("\n");
        }
        return buffer.toString();
    }
}
