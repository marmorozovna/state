package ru.morozevich.stateapp.model.entity;

public class State {
    private static State state;

    private State() {
    }

    public static State getState() {
        if (state == null) {
            state = new State();
        }
        return state;
    }
}
