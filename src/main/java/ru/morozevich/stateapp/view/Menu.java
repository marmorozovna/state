package ru.morozevich.stateapp.view;

import ru.morozevich.stateapp.controller.Controller;

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
                case 1 -> System.out.println("Столица государства: " + controller.getStateCapital());
                case 2 -> System.out.println("Областей в государстве: " + controller.getQuantityRegions());
                case 3 -> System.out.println("Площадь государства: " + controller.getStateSquare());
                case 4 -> System.out.println("Все областные центры: " + controller.getAllRegionCenters());
                case 5 -> System.out.println("Средний возраст: " + controller.getCitizenAverageAge());
                case 6 -> {
                    System.out.println("Пожалуйста, введите желаемое количество букв в имени:");
                    int wishedNum = controller.getUserInt();
                    System.out.println("Жители у которых в имени " + wishedNum + " букв: " + controller.getCitizenDesiredNum(wishedNum));
                }
                case 7 -> {
                    System.out.println("Пожалуйста, введите желаемую букву:");
                    char wishedLetter = controller.getUserChar();
                    System.out.println("Жители у которых в имени первая буква " + wishedLetter + ": " + "\n" + controller.getCitizenWishedLetter(wishedLetter));
                }
                case 8 -> System.out.println("Вы закрыли программу");
            }
        } while (controller.getUserInt() != 8);
    }
}
