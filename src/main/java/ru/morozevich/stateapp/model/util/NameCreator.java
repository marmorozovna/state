package ru.morozevich.stateapp.model.util;

import java.util.Random;

public class NameCreator {
    public String createName(int leftLimitChar, int rightLimitChar) {
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
