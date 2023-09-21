package ru.morozevich.stateapp.model.service;

import ru.morozevich.stateapp.model.entity.Citizen;

import java.util.ArrayList;

public class CitizenService {

    public static double getAverageAge(ArrayList<Citizen> stateCitizen) {
        double averageAge;
        int sumAgeAllCitizen = 0;
        for (Citizen citizen : stateCitizen) {
            sumAgeAllCitizen += citizen.getAge();
        }
        averageAge = (double) sumAgeAllCitizen / stateCitizen.size();
        return averageAge;
    }

    public static ArrayList<Citizen> listCitizenWishedQuantityLet(int quantityLetter,ArrayList<Citizen> allCitizen) {
        ArrayList<Citizen> CitizenWishedQuantityLet = new ArrayList<>();
        for (Citizen citizen : allCitizen) {
            String name = citizen.getFirstname();
            if (name.length() == quantityLetter) {
                CitizenWishedQuantityLet.add(citizen);
            }
        }
        return CitizenWishedQuantityLet;
    }

    public static ArrayList<Citizen> listCitizenWishedLetter(char desiredLetter, ArrayList<Citizen> allCitizen) {
        ArrayList<Citizen> CitizenWishedLetter = new ArrayList<>();
        for (Citizen citizen : allCitizen) {
            String name = citizen.getFirstname();
            if (name.charAt(0) == desiredLetter) {
                CitizenWishedLetter.add(citizen);
            }
        }
        return CitizenWishedLetter;
    }
}
