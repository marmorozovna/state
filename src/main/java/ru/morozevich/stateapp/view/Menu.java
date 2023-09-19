package ru.morozevich.stateapp.view;

import ru.morozevich.stateapp.model.entity.State;
import ru.morozevich.stateapp.model.service.CitizenService;
import ru.morozevich.stateapp.model.service.RegionService;

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
                    "7 - Узнать у скольки жителей имя начинается с буквы X" + "\n" +
                    "8 - Выход");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Столица государства: " + State.STATE.getCapital());
                    break;
                case 2:
                    System.out.println("Областей в государстве: " + RegionService.countRegions());
                    break;
                case 3:
                    System.out.println("Площадь государства: " + State.STATE.getSquare());
                    break;
                case 4:
                    System.out.println("Все областные центры: " + RegionService.getAllRegionCenters());
                    break;
                case 5:
                    System.out.println("Средний возраст: " + CitizenService.getAverageAge());
                    break;
                case 6:
                    System.out.println("Пожалуйста, введите желаемое количество букв:");
                    int quantityLetters = sc.nextInt();
                    System.out.println(":Жители у которых в имени " + quantityLetters + " букв: " + CitizenService.listCitizenNumberLetter(quantityLetters));
                    break;
                case 7:
                    System.out.println("Пожалуйста, введите желаемую букву:");
                    int desiredLetter = sc.nextInt();
                    System.out.println(":Жители у которых в имени перва буква" + desiredLetter + " : " + CitizenService.listCitizenNumberLetter(desiredLetter));
                    break;
                case 8:
                    System.out.println("Вы закрыли программу");
                    break;
            }
        } while (input != 8);
    }
}
