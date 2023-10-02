package ru.morozevich.stateapp.controller;

import ru.morozevich.stateapp.model.entity.Citizen;
import ru.morozevich.stateapp.model.entity.City;
import ru.morozevich.stateapp.model.entity.State;
import ru.morozevich.stateapp.model.service.CitizenService;
import ru.morozevich.stateapp.model.service.RegionService;
import ru.morozevich.stateapp.view.Output;
import ru.morozevich.stateapp.model.util.Input;

import java.util.ArrayList;


public class Controller {

    public int getUserInt() {
        return Input.getUserInt();
    }

    public char getUserChar() {
        return Input.getUserChar();
    }

    public City getStateCapital() {
        return State.STATE.getCapital();
    }

    public int getQuantityRegions() {
        return RegionService.countRegions();
    }

    public int getStateSquare() {
        return State.STATE.getSquare();
    }

    public String getAllRegionCenters() {
        return RegionService.getAllRegionCenters();
    }

    public double getCitizenAverageAge() {
        return CitizenService.getAverageAge(State.STATE.getStateCitizen());
    }

    public String getDesiredCitizen(int wishedNum) {
        ArrayList<Citizen> desiredCitizen = CitizenService.listCitizenWishedQuantityLet(wishedNum, State.STATE.getStateCitizen());
        Output output = new Output();
        return output.formatList(desiredCitizen);
    }

    public String getDesiredCitizen(char wishedLetter) {
        ArrayList<Citizen> desiredCitizen = CitizenService.listCitizenWishedLetter(wishedLetter, State.STATE.getStateCitizen());
        Output output = new Output();
        return output.formatList(desiredCitizen);
    }
}
