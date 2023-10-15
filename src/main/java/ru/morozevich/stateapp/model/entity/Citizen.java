package ru.morozevich.stateapp.model.entity;

import ru.morozevich.stateapp.model.util.NameCreator;

public class Citizen {
    private int id;
    private String firstname;
    private String surname;
    private int age;
    private City residence;

    private static int countId;

    public Citizen(City residence) {
        this.age = (int) (Math.random() * 100);
        NameCreator nameCreator = new NameCreator();
        this.firstname = nameCreator.createName();
        this.surname = nameCreator.createName();
        this.id = ++countId;
        this.residence = residence;
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
