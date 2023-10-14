package ru.morozevich.stateapp.controller;

import ru.morozevich.stateapp.model.entity.Citizen;
import ru.morozevich.stateapp.model.entity.City;
import ru.morozevich.stateapp.model.entity.State;
import ru.morozevich.stateapp.model.service.CitizenService;
import ru.morozevich.stateapp.model.service.RegionService;
import ru.morozevich.stateapp.view.ResultWriter;

import java.util.ArrayList;


public class StateController {

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
        ResultWriter resultWriter = new ResultWriter();
        return resultWriter.formatList(desiredCitizen);
    }

    public String getDesiredCitizen(char wishedLetter) {
        ArrayList<Citizen> desiredCitizen = CitizenService.listCitizenWishedLetter(wishedLetter, State.STATE.getStateCitizen());
        ResultWriter resultWriter = new ResultWriter();
        return resultWriter.formatList(desiredCitizen);
    }
}
