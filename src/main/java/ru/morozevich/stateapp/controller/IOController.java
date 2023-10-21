package ru.morozevich.stateapp.controller;

import ru.morozevich.stateapp.model.entity.Citizen;
import ru.morozevich.stateapp.model.entity.City;
import ru.morozevich.stateapp.model.service.KeyboardInput;
import ru.morozevich.stateapp.view.ResultWriter;

import java.util.ArrayList;

public class IOController {
    public int getUserInt() {
        return KeyboardInput.getUserInt();
    }

    public char getUserChar() {
        return KeyboardInput.getUserChar();
    }

    public void printCitizen(ArrayList<Citizen> citizens) {
        ResultWriter resultWriter = new ResultWriter();
        resultWriter.printCitizens(citizens);
    }

    public void printCities(ArrayList<City> cities) {
        ResultWriter resultWriter = new ResultWriter();
        resultWriter.printCities(cities);
    }
}
