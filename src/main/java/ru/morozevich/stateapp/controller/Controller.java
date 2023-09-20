package ru.morozevich.stateapp.controller;

import ru.morozevich.stateapp.view.Menu;

public class Controller {
    public void startApp() {
        Menu menu = new Menu();
        menu.showMenu();
    }
}
