package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.service.CitizenCreator;

import java.util.HashMap;
import java.util.HashSet;

public enum State {
    STATE();

    private final City capital = City.CAPITAL_CITY;
    private HashSet<Citizen> stateCitizen = CitizenCreator.createCitizen(500);

    private final int square = 357592;

    private State() {
    }

    public City getCapital() {
        return this.capital;
    }

    private State(HashSet<Citizen> stateCitizen) {
        this.stateCitizen = stateCitizen;
    }

    public HashSet<Citizen> getStateCitizen() {
        return this.stateCitizen;
    }

    public int getSquare() {
        return square;
    }

    @Override
    public String toString() {
        HashSet<Citizen> stateCitizen = getStateCitizen();
        StringBuilder buffer = new StringBuilder();
        HashSet<Citizen> citizenCapitalRegion = new HashSet<>();
        HashSet<Citizen> citizenIndustrialRegion = new HashSet<>();
        HashSet<Citizen> citizenSeasideRegion = new HashSet<>();
        HashSet<Citizen> citizenRuralRegion = new HashSet<>();
        HashSet<Citizen> citizenAncientRegion = new HashSet<>();
        for (Citizen citizen : stateCitizen) {
        switch(citizen.getResidence().getDistrict().getRegion()){
            case CAPITAL_REGION -> citizenCapitalRegion.add(citizen);
            case RURAL_REGION -> citizenRuralRegion.add(citizen);
            case ANCIENT_REGION -> citizenAncientRegion.add(citizen);
            case SEESIDE_REGION -> citizenSeasideRegion.add(citizen);
            case INDUSTRIAL_REGION -> citizenIndustrialRegion.add(citizen);
        }
        }
        buffer.append(Region.CAPITAL_REGION);
        buffer.append("\n");
        for (Citizen citizen : citizenCapitalRegion) {
            buffer.append(citizen.toString());
            buffer.append("\n");
        }
        buffer.append(Region.INDUSTRIAL_REGION);
        buffer.append("\n");
        for (Citizen citizen : citizenIndustrialRegion) {
            buffer.append(citizen.toString());
            buffer.append("\n");
        }
        buffer.append(Region.SEESIDE_REGION);
        buffer.append("\n");
        for (Citizen citizen : citizenSeasideRegion) {
            buffer.append(citizen.toString());
            buffer.append("\n");
        }
        buffer.append(Region.RURAL_REGION);
        buffer.append("\n");
        for (Citizen citizen : citizenRuralRegion) {
            buffer.append(citizen.toString());
            buffer.append("\n");
        }
        buffer.append(Region.ANCIENT_REGION);
        buffer.append("\n");
        for (Citizen citizen : citizenAncientRegion) {
            buffer.append(citizen.toString());
            buffer.append("\n");
        }
        return buffer.toString();
    }
}
