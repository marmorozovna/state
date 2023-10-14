package ru.morozevich.stateapp.model.service;

import ru.morozevich.stateapp.model.entity.Citizen;
import ru.morozevich.stateapp.model.util.NameCreator;

import java.util.ArrayList;

public class CitizenCreator {
    public static String createName() {
        NameCreator nameCreator = new NameCreator();
        return nameCreator.createName();
    }

    public static int createAge() {
        return (int) (Math.random() * 100);
    }

    public static ArrayList<Citizen> createCitizen(int quantityCitizen) {
        ArrayList<Citizen> stateCitizen = new ArrayList<>(quantityCitizen);
        for (int i = 0; i < quantityCitizen; i++) {
            Citizen citizen = new Citizen();
            stateCitizen.add(citizen);
        }
        return stateCitizen;
    }
}
