package ru.morozevich.stateapp.controller;

import ru.morozevich.stateapp.model.entity.Citizen;
import ru.morozevich.stateapp.model.entity.City;
import ru.morozevich.stateapp.model.entity.State;
import ru.morozevich.stateapp.model.service.CitizenService;
import ru.morozevich.stateapp.model.service.CityService;
import ru.morozevich.stateapp.view.ResultWriter;

import java.util.ArrayList;


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

    public String findCitizen(int wishedNum, ArrayList<Citizen> allCitizens) {
        ArrayList<Citizen> foundCitizens = CitizenService.findCitizen(wishedNum, allCitizens);
        ResultWriter resultWriter = new ResultWriter();
        return resultWriter.printCitizens(foundCitizens);
    }

    public String findCitizen(char wishedLetter, ArrayList<Citizen> allCitizens) {
        ArrayList<Citizen> foundCitizens = CitizenService.findCitizen(wishedLetter, allCitizens);
        ResultWriter resultWriter = new ResultWriter();
        return resultWriter.printCitizens(foundCitizens);
    }
}
