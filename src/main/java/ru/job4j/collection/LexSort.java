package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] arLeft = left.split("\\.");
        String[] arRight = right.split("\\.");
        int intLeft = Integer.parseInt(arLeft[0]);
        int intRight = Integer.parseInt(arRight[0]);
        return Integer.compare(intLeft, intRight);
    }
}
