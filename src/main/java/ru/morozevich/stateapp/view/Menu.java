package ru.morozevich.stateapp.view;

import ru.morozevich.stateapp.model.entity.State;

import java.util.Scanner;

public class Menu {

    public static void showMenu() {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("Пожалуйста, выберете действие, введя соотвествующую цифру на клавиатуре:" + "\n" +
                    "1 - Узнать столицу" + "\n" +
                    "2 - Узнать количество областей" + "\n" +
                    "3 - Узнать площадь государства" + "\n" +
                    "4 - Узнать областные центры" + "\n" +
                    "5 - Узнать средний возраст жителей" + "\n" +
                    "6 - Узнать у скольки жителей в имени X букв" + "\n" +
                    "7 - Выход");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println(State.STATE.getCapital());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7: System.out.println("Вы закрыли программу");
                    break;
            }
        } while (input != 7);
    }
}
