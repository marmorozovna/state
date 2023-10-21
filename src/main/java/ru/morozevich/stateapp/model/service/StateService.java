package ru.morozevich.stateapp.model.service;

import ru.morozevich.stateapp.model.entity.Citizen;
import ru.morozevich.stateapp.model.entity.State;

import java.util.ArrayList;

public class StateService {

    public static int getQuantityRegions() {
        return State.getInstance().getRegions().size();
    }

    public static int getStateSquare() {
        return State.getInstance().getSquare();
    }

    public static ArrayList<Citizen> getAllCitizen() {
        return State.getInstance().getAllCitizens();
    }
}
