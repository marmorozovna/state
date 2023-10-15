package ru.morozevich.stateapp.model.service;

import ru.morozevich.stateapp.model.entity.Citizen;
import ru.morozevich.stateapp.model.entity.City;
import ru.morozevich.stateapp.model.entity.State;

import java.util.ArrayList;

public class CitizenService {

    public static double getAverageAge(ArrayList<Citizen> allCitizens) {
        State.getInstance();
        double averageAge;
        int sumAgeAllCitizen = 0;
        for (Citizen citizen : allCitizens) {
            sumAgeAllCitizen += citizen.getAge();
        }
        averageAge = (double) sumAgeAllCitizen / allCitizens.size();
        return averageAge;
    }

    public static ArrayList<Citizen> listCitizenWishedQuantityLet(int quantityLetter) {
        ArrayList<Citizen> CitizenWishedQuantityLet = new ArrayList<>();
        for (Citizen citizen : City.getAllCitizens()) {
            String name = citizen.getFirstname();
            if (name.length() == quantityLetter) {
                CitizenWishedQuantityLet.add(citizen);
            }
        }
        return CitizenWishedQuantityLet;
    }

    public static ArrayList<Citizen> listCitizenWishedLetter(char desiredLetter) {
        ArrayList<Citizen> CitizenWishedLetter = new ArrayList<>();
        for (Citizen citizen : City.getAllCitizens()) {
            String name = citizen.getFirstname();
            if (name.charAt(0) == desiredLetter) {
                CitizenWishedLetter.add(citizen);
            }
        }
        return CitizenWishedLetter;
    }
}
