package ru.morozevich.stateapp.model.service;

import ru.morozevich.stateapp.model.entity.Citizen;
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

    public static ArrayList<Citizen> findCitizen(int quantityLetter, ArrayList<Citizen> allCitizens) {
        ArrayList<Citizen> foundCitizen = new ArrayList<>();
        for (Citizen citizen : allCitizens) {
            String name = citizen.getFirstname();
            if (name.length() == quantityLetter) {
                foundCitizen.add(citizen);
            }
        }

        return foundCitizen;
    }

    public static ArrayList<Citizen> findCitizen(char desiredLetter, ArrayList<Citizen> allCitizens) {
        ArrayList<Citizen> foundCitizen = new ArrayList<>();
        for (Citizen citizen : allCitizens) {
            String name = citizen.getFirstname();
            if (name.charAt(0) == desiredLetter) {
                foundCitizen.add(citizen);
            }
        }
        return foundCitizen;
    }
}
