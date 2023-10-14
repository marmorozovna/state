package ru.morozevich.stateapp.model.service;

import ru.morozevich.stateapp.model.entity.Citizen;
import ru.morozevich.stateapp.model.entity.City;

import java.util.ArrayList;

public class CitizenService {

    public static double getAverageAge() {
        double averageAge;
        int sumAgeAllCitizen = 0;
        for (Citizen citizen : City.getAllCitizens()) {
            sumAgeAllCitizen += citizen.getAge();
        }
        averageAge = (double) sumAgeAllCitizen / City.getAllCitizens().size();
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
