package ru.morozevich.stateapp.model.util;

import java.util.Random;

public class NameCreator {
    public String createName() {
        Random random = new Random();
        int leftLimitChar = 97;
        int rightLimitChar = 122;
        int targetStringLength = random.nextInt(5, 11);
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = random.nextInt(leftLimitChar, rightLimitChar + 1);
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}
