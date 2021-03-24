package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueText {

    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        /* for-each origin -> new HashSet. */
        /* for-each text -> hashSet.contains */
        HashSet<String> check = new HashSet<>(Arrays.asList(origin));
        for (String tex : text) {
            if (!check.contains(tex)) {
                return false;
            }
        }
        return rsl;
    }
}
