package ru.morozevich.stateapp.view;

import ru.morozevich.stateapp.controller.Controller;
import ru.morozevich.stateapp.model.entity.State;
import ru.morozevich.stateapp.model.service.CitizenService;
import ru.morozevich.stateapp.model.service.RegionService;

public class Menu {

    Controller controller = new Controller();

    public void showMenu() {
        do {
            System.out.println("Пожалуйста, выберете действие, введя соотвествующую цифру на клавиатуре:" + "\n" +
                    "1 - Узнать столицу" + "\n" +
                    "2 - Узнать количество областей" + "\n" +
                    "3 - Узнать площадь государства" + "\n" +
                    "4 - Узнать областные центры" + "\n" +
                    "5 - Узнать средний возраст жителей" + "\n" +
                    "6 - Узнать жителей, у которых в имени X букв" + "\n" +
                    "7 - Узнать жителей, у которых имя начинается с буквы X" + "\n" +
                    "8 - Выход");
            switch (controller.getUserInt()) {
                case 1 -> System.out.println("Столица государства: " + State.STATE.getCapital());
                case 2 -> System.out.println("Областей в государстве: " + RegionService.countRegions());
                case 3 -> System.out.println("Площадь государства: " + State.STATE.getSquare());
                case 4 -> System.out.println("Все областные центры: " + RegionService.getAllRegionCenters());
                case 5 ->
                        System.out.println("Средний возраст: " + CitizenService.getAverageAge(State.STATE.getStateCitizen()));
                case 6 -> {
                    System.out.println("Пожалуйста, введите желаемое количество букв:");
                    int quantityLetters = controller.getUserInt();
                    System.out.println("Жители у которых в имени " + quantityLetters + " букв: " + Output.formatList(CitizenService.listCitizenNumberLetter(quantityLetters)));
                }
                case 7 -> {
                    System.out.println("Пожалуйста, введите желаемую букву:");
                    char desiredLetter = controller.getUserChar();
                    System.out.println("Жители у которых в имени первая буква " + desiredLetter + ": " + "\n" + Output.formatList(CitizenService.listCitizenDesiredLetter(desiredLetter)));
                }
                case 8 -> System.out.println("Вы закрыли программу");
            }
        } while (controller.getUserInt() != 8);
    }
}
