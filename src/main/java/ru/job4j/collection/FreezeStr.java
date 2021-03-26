package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        String[] arLeft = left.split("");
        String[] arRight = right.split("");
        List<String> listLeft = Arrays.asList(arLeft);
        List<String> listRight = Arrays.asList(arRight);
        Collections.sort(listLeft);
        Collections.sort(listRight);
        return listLeft.equals(listRight);
    }
}
