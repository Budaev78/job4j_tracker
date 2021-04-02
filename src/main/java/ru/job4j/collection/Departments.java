package ru.job4j.collection;

import java.util.*;

public class Departments<result> {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        List<String> result = new ArrayList<>();
        for (String value : deps) {
            Collections.addAll(tmp, value.split("/"));
        }
        String start = "";
        for (String el : tmp) {
            if (result.size() == 0) {
                start = el;
            } else {
                start += "/" + el;
            }
            result.add(start);
        }
        return new ArrayList<>(result);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(Collections.reverseOrder());
    }
}
