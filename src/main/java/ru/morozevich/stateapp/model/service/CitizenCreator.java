package ru.morozevich.stateapp.model.service;

import java.util.Random;

public class CitizenCreator {
    public static String createName() {
        int leftLimitChar = 97;
        int rightLimitChar = 122;
        Random random = new Random();
        int targetStringLength = random.nextInt(5, 11);
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = random.nextInt(leftLimitChar, rightLimitChar + 1);
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    public static int createAge() {
        return (int) (Math.random() * 100);
    }
}
