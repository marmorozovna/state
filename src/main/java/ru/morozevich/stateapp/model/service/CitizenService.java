package ru.morozevich.stateapp.model.service;

import ru.morozevich.stateapp.model.entity.Citizen;
import ru.morozevich.stateapp.model.entity.State;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CitizenService {

    public static int getAverageAge() {
        int averageAge;
        int sumAgeAllCitizen = 0;
        HashSet<Citizen> stateCitizen = State.STATE.getStateCitizen();
        for (Citizen citizen : stateCitizen) {
            sumAgeAllCitizen += citizen.getAge();
        }
        averageAge = sumAgeAllCitizen / stateCitizen.size();
        return averageAge;
    }

    public static ArrayList<Citizen> listCitizenNumberLetter(int quantityLetter) {
        HashSet<Citizen> allCitizen = State.STATE.getStateCitizen();
        ArrayList<Citizen> listCitizenNumberLetter = new ArrayList<>();
        for (Citizen citizen : allCitizen) {
            String name = citizen.getFirstname();
            if (name.length() == quantityLetter){
                listCitizenNumberLetter.add(citizen);
            }
        }
        return listCitizenNumberLetter;
    }

    public static ArrayList<Citizen> listCitizenDesiredLetter(char desiredLetter) {
        HashSet<Citizen> allCitizen = State.STATE.getStateCitizen();
        ArrayList<Citizen> listCitizenDesiredLetter = new ArrayList<>();
        for (Citizen citizen : allCitizen) {
            String name = citizen.getFirstname();
            if (name.charAt(0) == desiredLetter){
                listCitizenDesiredLetter.add(citizen);
            }
        }
        return listCitizenDesiredLetter;
    }
}
