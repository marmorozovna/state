package ru.morozevich.stateapp.model.service;

import ru.morozevich.stateapp.model.entity.City;

import java.util.Random;

public class CityService {

    public City getRandomCity() {
        Random random = new Random();
        City randomCity;
        switch (random.nextInt(1, 26)) {
            case 1:
                randomCity = City.NON_CAPITAL_CITY1;
            case 2:
                randomCity = City.NON_CAPITAL_CITY2;
            case 3:
                randomCity = City.NON_CAPITAL_CITY3;
            case 4:
                randomCity = City.NON_CAPITAL_CITY4;
            case 5:
                randomCity = City.NON_CAPITAL_CITY5;
            case 6:
                randomCity = City.NON_CAPITAL_CITY6;
            case 7:
                randomCity = City.NON_CAPITAL_CITY7;
            case 8:
                randomCity = City.NON_CAPITAL_CITY8;
            case 9:
                randomCity = City.NON_CAPITAL_CITY9;
            case 10:
                randomCity = City.NON_CAPITAL_CITY10;
            case 11:
                randomCity = City.NON_CAPITAL_CITY11;
            case 12:
                randomCity = City.NON_CAPITAL_CITY12;
            case 13:
                randomCity = City.NON_CAPITAL_CITY13;
            case 14:
                randomCity = City.NON_CAPITAL_CITY14;
            case 15:
                randomCity = City.NON_CAPITAL_CITY15;
            case 16:
                randomCity = City.NON_CAPITAL_CITY16;
            case 17:
                randomCity = City.NON_CAPITAL_CITY17;
            case 18:
                randomCity = City.NON_CAPITAL_CITY18;
            case 19:
                randomCity = City.NON_CAPITAL_CITY19;
            case 20:
                randomCity = City.NON_CAPITAL_CITY20;
            case 21:
                randomCity = City.NON_CAPITAL_CITY21;
            case 22:
                randomCity = City.NON_CAPITAL_CITY22;
            case 23:
                randomCity = City.NON_CAPITAL_CITY23;
            case 24:
                randomCity = City.NON_CAPITAL_CITY24;
            case 25:
                randomCity = City.NON_CAPITAL_CITY25;
            case 26:
                randomCity = City.CAPITAL_CITY;
        }
        return randomCity;
    }
}
