package ru.morozevich.stateapp.controller;

import ru.morozevich.stateapp.view.Menu;

import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner(System.in);

    public void startApp() {
        Menu menu = new Menu();
        menu.showMenu();
    }

    public int getUserInt(){
        return sc.nextInt();
    }

    public char getUserChar(){
        return sc.next().charAt(0);
    }
}
