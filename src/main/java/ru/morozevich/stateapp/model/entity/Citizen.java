package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.service.CitizenCreator;
import ru.morozevich.stateapp.model.service.CityService;

public class Citizen {
    private int id;
    private String firstname;
    private String surname;
    private final int age;
    private City residence;

    private static int countId;

    public Citizen() {
        this.age = CitizenCreator.createAge();
        this.firstname = CitizenCreator.createName();
        this.surname = CitizenCreator.createName();
        this.id = ++countId;
        CityService.setRandomCity(this);
    }

    public Citizen(int age, String firstname) {
        this.age = age;
        this.firstname = firstname;
    }

    public Citizen(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public void setResidence(City residence) {
        this.residence = residence;
    }

    public City getResidence() {
        return residence;
    }

    @Override
    public String toString() {
        return getFirstname();
    }

    public Region getRegion() {
        return this.getResidence().getDistrict().getRegion();
    }
}
