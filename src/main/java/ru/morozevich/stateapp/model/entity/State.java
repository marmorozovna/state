package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.service.CitizenCreator;

import java.util.ArrayList;
import java.util.Random;

public class State {
    private static State instance;

    private State() {
    }
    public static State getInstance() {
        if (instance == null) {
            instance = new State();
        }
        return instance;
    }

    private City capital;
    private final ArrayList<Citizen> stateCitizen = CitizenCreator.createCitizen(1000);
    private int square;

    public City getCapital() {
        return this.capital;
    }

    public ArrayList<Citizen> getStateCitizen() {
        return this.stateCitizen;
    }

    public int getSquare() {
        if (square == 0){
            this.setSquare();
        }
        return square;
    }

    private void setSquare (){
        Random random = new Random();
        this.square = random.nextInt(44,1700);
    }

    private void setCapital(){

    }
}
