package ru.morozevich.stateapp.controller;

import ru.morozevich.stateapp.model.service.KeyboardInput;

public class IOController {
    public int getUserInt() {
        return KeyboardInput.getUserInt();
    }

    public char getUserChar() {
        return KeyboardInput.getUserChar();
    }
}
