package ru.morozevich.stateapp.model.util;

import ru.morozevich.stateapp.controller.IOController;
import ru.morozevich.stateapp.controller.StateController;

public class Menu {

    StateController stateController = new StateController();
    IOController ioController = new IOController();

    public void showMenu() {
        int input;
        do {
            System.out.println("""
                    Пожалуйста, выберите действие, введя соответствующую цифру на клавиатуре:
                    1 - Узнать столицу
                    2 - Узнать количество областей
                    3 - Узнать площадь государства
                    4 - Узнать областные центры
                    5 - Узнать средний возраст жителей
                    6 - Узнать жителей, у которых в имени X букв
                    7 - Узнать жителей, у которых имя начинается с буквы X
                    8 - Выход""");
            input = ioController.getUserInt();
            switch (input) {
                case 1 -> System.out.println("Столица государства: "
                        + stateController.getStateCapital());
                case 2 -> System.out.println("Областей в государстве: "
                        + stateController.getQuantityRegions());
                case 3 -> System.out.println("Площадь государства: "
                        + stateController.getStateSquare() + " га");
                case 4 -> {
                    System.out.println("Все областные центры: ");
                    stateController.getAllRegionCenters();
                }
                case 5 -> System.out.println("Средний возраст жителей: "
                        + stateController.getCitizenAverageAge(stateController.getAllCitizen()));
                case 6 -> {
                    System.out.println("Пожалуйста, введите желаемое количество букв в имени:");
                    int wishedNum = ioController.getUserInt();
                    System.out.println("Жители у которых в имени " + wishedNum + " букв: ");
                    stateController.findCitizen(wishedNum, stateController.getAllCitizen());
                }
                case 7 -> {
                    System.out.println("Пожалуйста, введите желаемую букву:");
                    char wishedLetter = ioController.getUserChar();
                    System.out.println("Жители у которых в имени первая буква " + wishedLetter
                            + ":\n");
                    stateController.findCitizen(wishedLetter, stateController.getAllCitizen());
                }
                case 8 -> System.out.println("Вы закрыли программу");
            }
        } while (input != 8);
    }
}
