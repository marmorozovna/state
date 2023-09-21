package ru.morozevich.stateapp.model.service;

import ru.morozevich.stateapp.model.entity.Citizen;
import ru.morozevich.stateapp.model.util.NameCreator;

import java.util.HashSet;

public class CitizenCreator {
    public static String createName() {
        NameCreator nameCreator = new NameCreator();
        return nameCreator.createName(97, 122);
    }

    public static int createAge() {
        return (int) (Math.random() * 100);
    }

    public static HashSet<Citizen> createCitizen(int quantityCitizen) {
        HashSet<Citizen> stateCitizen = new HashSet<>(quantityCitizen);
        for (int i = 0; i < quantityCitizen; i++) {
            Citizen citizen = new Citizen();
            stateCitizen.add(citizen);
        }
        return stateCitizen;
    }
}
