package ru.morozevich.stateapp.model.service;

import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);
    public static int getUserInt() {
        return sc.nextInt();
    }

    public static char getUserChar() {
        return sc.next().charAt(0);
    }
}
