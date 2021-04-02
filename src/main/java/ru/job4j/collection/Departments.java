package ru.job4j.collection;

import java.util.*;

public class Departments<result> {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        String start = "";
        for (String value : deps) {
            for (String el : value.split("/")) {
                if (tmp.isEmpty() || start.equals(el)) {
                    start = el;
                } else {
                    start += "/" + el;
                }
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}
