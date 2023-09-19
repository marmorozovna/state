package ru.morozevich.stateapp.model.service;

import java.util.Random;

public class RegionCreator {

    public static String createName() {
        int leftLimitChar = 65;
        int rightLimitChar = 90;
        Random random = new Random();
        int targetStringLength = random.nextInt(5, 11);
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = random.nextInt(leftLimitChar, rightLimitChar + 1);
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}
