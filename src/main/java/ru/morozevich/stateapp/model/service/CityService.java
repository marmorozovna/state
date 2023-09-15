package ru.morozevich.stateapp.model.service;

import ru.morozevich.stateapp.model.entity.Citizen;
import ru.morozevich.stateapp.model.entity.City;

import java.util.Random;

public class CityService {

    public static void setRandomCity(Citizen citizen) {
        Random random = new Random();
        switch (random.nextInt(1, 27)) {
            case 1:
                citizen.setResidence(City.NON_CAPITAL_CITY1);
                break;
            case 2:
                citizen.setResidence(City.NON_CAPITAL_CITY2);
                break;
            case 3:
                citizen.setResidence(City.NON_CAPITAL_CITY3);
                break;
            case 4:
                citizen.setResidence(City.NON_CAPITAL_CITY4);
                break;
            case 5:
                citizen.setResidence(City.NON_CAPITAL_CITY5);
                break;
            case 6:
                citizen.setResidence(City.NON_CAPITAL_CITY6);
                break;
            case 7:
                citizen.setResidence(City.NON_CAPITAL_CITY7);
                break;
            case 8:
                citizen.setResidence(City.NON_CAPITAL_CITY8);
                break;
            case 9:
                citizen.setResidence(City.NON_CAPITAL_CITY9);
                break;
            case 10:
                citizen.setResidence(City.NON_CAPITAL_CITY10);
                break;
            case 11:
                citizen.setResidence(City.NON_CAPITAL_CITY11);
                break;
            case 12:
                citizen.setResidence(City.NON_CAPITAL_CITY12);
                break;
            case 13:
                citizen.setResidence(City.NON_CAPITAL_CITY13);
                break;
            case 14:
                citizen.setResidence(City.NON_CAPITAL_CITY14);
            case 15:
                citizen.setResidence(City.NON_CAPITAL_CITY15);
                break;
            case 16:
                citizen.setResidence(City.NON_CAPITAL_CITY16);
                break;
            case 17:
                citizen.setResidence(City.NON_CAPITAL_CITY17);
                break;
            case 18:
                citizen.setResidence(City.NON_CAPITAL_CITY18);
                break;
            case 19:
                citizen.setResidence(City.NON_CAPITAL_CITY19);
                break;
            case 20:
                citizen.setResidence(City.NON_CAPITAL_CITY20);
                break;
            case 21:
                citizen.setResidence(City.NON_CAPITAL_CITY21);
                break;
            case 22:
                citizen.setResidence(City.NON_CAPITAL_CITY22);
                break;
            case 23:
                citizen.setResidence(City.NON_CAPITAL_CITY23);
                break;
            case 24:
                citizen.setResidence(City.NON_CAPITAL_CITY24);
                break;
            case 25:
                citizen.setResidence(City.NON_CAPITAL_CITY25);
                break;
            case 26:
                citizen.setResidence(City.CAPITAL_CITY);
                break;
        }
    }
}
