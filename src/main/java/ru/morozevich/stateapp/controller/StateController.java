package ru.morozevich.stateapp.controller;

import ru.morozevich.stateapp.model.entity.Citizen;
import ru.morozevich.stateapp.model.entity.City;
import ru.morozevich.stateapp.model.entity.State;
import ru.morozevich.stateapp.model.service.CitizenService;
import ru.morozevich.stateapp.view.ResultWriter;

import java.util.ArrayList;


public class StateController {
// вынести логику в service
    public City getStateCapital() {
        return State.getInstance().getCapital();
    }

    public int getQuantityRegions() {
        return State.getInstance().getRegions().size();
    }

    public int getStateSquare() {
        return State.getInstance().getSquare();
    }

    public String getAllRegionCenters() {
        return City.getAllCitizens().toString();
    }

    public double getCitizenAverageAge() {
        return CitizenService.getAverageAge();
    }

//    public String getDesiredCitizen(int wishedNum) {
//        ArrayList<Citizen> desiredCitizen = CitizenService.listCitizenWishedQuantityLet(wishedNum);
//        ResultWriter resultWriter = new ResultWriter();
//        return resultWriter.formatList(desiredCitizen);
//    }
//
//    public String getDesiredCitizen(char wishedLetter) {
//        ArrayList<Citizen> desiredCitizen = CitizenService.listCitizenWishedLetter(wishedLetter);
//        ResultWriter resultWriter = new ResultWriter();
//        return resultWriter.formatList(desiredCitizen);
//    }
}
