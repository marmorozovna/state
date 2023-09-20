package ru.morozevich.stateapp.view;

import ru.morozevich.stateapp.model.entity.Citizen;

import java.util.ArrayList;

public class Output {
    public static String formatList(ArrayList<Citizen> citizenArrayList) {
        StringBuilder buffer = new StringBuilder();
        ArrayList<Citizen> citizenCapitalRegion = new ArrayList<>();
        ArrayList<Citizen> citizenIndustrialRegion = new ArrayList<>();
        ArrayList<Citizen> citizenSeasideRegion = new ArrayList<>();
        ArrayList<Citizen> citizenRuralRegion = new ArrayList<>();
        ArrayList<Citizen> citizenAncientRegion = new ArrayList<>();
        for (Citizen citizen : citizenArrayList) {
            switch (citizen.getRegion()) {
                case CAPITAL_REGION -> citizenCapitalRegion.add(citizen);
                case RURAL_REGION -> citizenRuralRegion.add(citizen);
                case ANCIENT_REGION -> citizenAncientRegion.add(citizen);
                case SEESIDE_REGION -> citizenSeasideRegion.add(citizen);
                case INDUSTRIAL_REGION -> citizenIndustrialRegion.add(citizen);
            }
        }
        buffer.append (printRegionCitizen(citizenCapitalRegion));
        buffer.append (printRegionCitizen(citizenIndustrialRegion));
        buffer.append (printRegionCitizen(citizenSeasideRegion));
        buffer.append (printRegionCitizen(citizenRuralRegion));
        buffer.append (printRegionCitizen(citizenAncientRegion));
        return buffer.toString();
    }

    public static StringBuilder printRegionCitizen(ArrayList<Citizen> citizenRegion) {
        StringBuilder buffer = new StringBuilder();
        buffer.append("\n");
        buffer.append("Название региона: ");
        buffer.append(citizenRegion.get(0).getRegion());
        buffer.append("\n");
        for (Citizen citizen : citizenRegion) {
            buffer.append(citizen.toString());
            buffer.append("\n");
        }
        return buffer;
    }
}
