package ru.morozevich.stateapp.controller;

import ru.morozevich.stateapp.model.entity.City;
import ru.morozevich.stateapp.model.entity.State;
import ru.morozevich.stateapp.model.service.CitizenService;
import ru.morozevich.stateapp.model.service.CityService;


public class StateController {

    // вынести логику в service
    public City getStateCapital() {
        CityService cityService = new CityService();
        return cityService.findCapital();
    }

    public int getQuantityRegions() {
        return State.getInstance().getRegions().size();
    }

    public int getStateSquare() {
        return State.getInstance().getSquare();
    }

    public String getAllRegionCenters() {
        CityService cityService = new CityService();
        return cityService.findRegionCentres().toString();
    }

    public double getCitizenAverageAge() {
        return CitizenService.getAverageAge(City.getAllCitizens());
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
