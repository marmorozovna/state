package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.service.CitizenCreator;
import ru.morozevich.stateapp.model.service.CityService;

public class Citizen {
    private int id;
    private String firstname;
    private String surname;
    private int age;
    private City residence;

    public Citizen() {
        this.age = CitizenCreator.createAge();
        this.firstname = CitizenCreator.createName();
        this.surname = CitizenCreator.createName();
        this.id = ((Integer) age).hashCode() + firstname.hashCode() + surname.hashCode();
        if (this.id < 0) {
            this.id = -this.id;
        }
        CityService.setRandomCity(this);
    }

    public int getId() {
        return id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
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
}
