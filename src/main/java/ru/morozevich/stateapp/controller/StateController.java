package ru.morozevich.stateapp.controller;

import ru.morozevich.stateapp.model.entity.Citizen;
import ru.morozevich.stateapp.model.entity.City;
import ru.morozevich.stateapp.model.service.CitizenService;
import ru.morozevich.stateapp.model.service.CityService;
import ru.morozevich.stateapp.model.service.StateService;

import java.util.ArrayList;


public class StateController {
    public City getStateCapital() {
        CityService cityService = new CityService();
        return cityService.findCapital();
    }

    public int getQuantityRegions() {
        return StateService.getQuantityRegions();
    }

    public int getStateSquare() {
        return StateService.getStateSquare();
    }

    public void getAllRegionCenters() {
        CityService cityService = new CityService();
        IOController ioController = new IOController();
        ioController.printCities(cityService.findRegionCentres());
    }

    public ArrayList<Citizen> getAllCitizen() {
        return StateService.getAllCitizen();
    }

    public double getCitizenAverageAge() {
        return CitizenService.getAverageAge(StateService.getAllCitizen());
    }

    public void findCitizen(int wishedNum, ArrayList<Citizen> allCitizens) {
        ArrayList<Citizen> foundCitizens = CitizenService.findCitizen(wishedNum, allCitizens);
        IOController ioController = new IOController();
        ioController.printCitizen(foundCitizens);
    }

    public void findCitizen(char wishedLetter, ArrayList<Citizen> allCitizens) {
        ArrayList<Citizen> foundCitizens = CitizenService.findCitizen(wishedLetter, allCitizens);
        IOController ioController = new IOController();
        ioController.printCitizen(foundCitizens);
    }
}
