package ru.morozevich.stateapp.model.service;

import ru.morozevich.stateapp.model.entity.Citizen;

import java.util.Random;

public class CitizenCreator {
    public static String createName() {
        int leftLimitChar = 97;
        int rightLimitChar = 122;
        int targetStringLength = (int) (Math.random() * 10 + 5);
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimitChar +
                    (int) (random.nextFloat() * (rightLimitChar - leftLimitChar + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    public static int createAge() {
        return (int) (Math.random() * 100);
    }
}
