package ru.morozevich.stateapp.model.service;

import ru.morozevich.stateapp.model.entity.Citizen;
import ru.morozevich.stateapp.model.entity.City;

import java.util.Random;

public class CityService {

    public static void setRandomCity(Citizen citizen) {
        Random random = new Random();
        switch (random.nextInt(1, 26)) {
            case 1:
                citizen.setResidence(City.NON_CAPITAL_CITY1);
            case 2:
                citizen.setResidence(City.NON_CAPITAL_CITY2);
            case 3:
                citizen.setResidence(City.NON_CAPITAL_CITY3);
            case 4:
                citizen.setResidence(City.NON_CAPITAL_CITY4);
            case 5:
                citizen.setResidence(City.NON_CAPITAL_CITY5);
            case 6:
                citizen.setResidence(City.NON_CAPITAL_CITY6);
            case 7:
                citizen.setResidence(City.NON_CAPITAL_CITY7);
            case 8:
                citizen.setResidence(City.NON_CAPITAL_CITY8);
            case 9:
                citizen.setResidence(City.NON_CAPITAL_CITY9);
            case 10:
                citizen.setResidence(City.NON_CAPITAL_CITY10);
            case 11:
                citizen.setResidence(City.NON_CAPITAL_CITY11);
            case 12:
                citizen.setResidence(City.NON_CAPITAL_CITY12);
            case 13:
                citizen.setResidence(City.NON_CAPITAL_CITY13);
            case 14:
                citizen.setResidence(City.NON_CAPITAL_CITY14);
            case 15:
                citizen.setResidence(City.NON_CAPITAL_CITY15);
            case 16:
                citizen.setResidence(City.NON_CAPITAL_CITY16);
            case 17:
                citizen.setResidence(City.NON_CAPITAL_CITY17);
            case 18:
                citizen.setResidence(City.NON_CAPITAL_CITY18);
            case 19:
                citizen.setResidence(City.NON_CAPITAL_CITY19);
            case 20:
                citizen.setResidence(City.NON_CAPITAL_CITY20);
            case 21:
                citizen.setResidence(City.NON_CAPITAL_CITY21);
            case 22:
                citizen.setResidence(City.NON_CAPITAL_CITY22);
            case 23:
                citizen.setResidence(City.NON_CAPITAL_CITY23);
            case 24:
                citizen.setResidence(City.NON_CAPITAL_CITY24);
            case 25:
                citizen.setResidence(City.NON_CAPITAL_CITY25);
            case 26:
                citizen.setResidence(City.CAPITAL_CITY);
        }
    }
}
