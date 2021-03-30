package ru.job4j.collection;

import java.util.*;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        Map<Character, Integer> leftMap = new HashMap<>();
        char[] arLeft = left.toCharArray();
        for (char item : arLeft) {
            int count = leftMap.getOrDefault(item, 0);
            leftMap.put(item, count + 1);
        }
        char[] arRight = right.toCharArray();
        for (char c : arRight) {
            Integer value = leftMap.get(c);
            if (leftMap.containsKey(c) && value == 1) {
                leftMap.remove(c);
            }
            if (leftMap.containsKey(c) && value > 1) {
                leftMap.put(c, value - 1);
            }
            if (leftMap.size() == 0) {
                return true;
            }
        }
        return false;
    }
}
