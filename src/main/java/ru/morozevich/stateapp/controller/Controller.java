package ru.morozevich.stateapp.controller;

import ru.morozevich.stateapp.model.entity.City;
import ru.morozevich.stateapp.model.entity.State;
import ru.morozevich.stateapp.model.service.CitizenService;
import ru.morozevich.stateapp.model.service.RegionService;
import ru.morozevich.stateapp.view.Menu;
import ru.morozevich.stateapp.view.Output;

import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner(System.in);

    public void startApp() {
        Menu menu = new Menu();
        menu.showMenu();
    }

    public int getUserInt() {
        return sc.nextInt();
    }

    public char getUserChar() {
        return sc.next().charAt(0);
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

    public String getCitizenDesiredNum(int wishedNum) {
        return Output.formatList(CitizenService.listCitizenNumberLetter(wishedNum));
    }

    public String getCitizenWishedLetter(char wishedLetter) {
        return Output.formatList(CitizenService.listCitizenDesiredLetter(wishedLetter));
    }
}
