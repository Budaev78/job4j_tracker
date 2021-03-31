package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean rsl = true;
        String orig = origin.replaceAll("\\p{P}", "");
        String lin = line.replaceAll("\\p{P}", "");
        String[] originText = orig.split(" ");
        String[] lineText = lin.split(" ");
        HashSet<String> check = new HashSet<>(Arrays.asList(originText));
        for (String lineTex : lineText) {
            if (!check.contains(lineTex)) {
                return false;
            }
        }
        return rsl;
    }
}
