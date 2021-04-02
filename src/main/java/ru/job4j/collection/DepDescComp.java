package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] arO1 = o1.split("/");
        String[] arO2 = o2.split("/");
        int rsl = arO2[0].compareTo(arO1[0]);
        return rsl == 0 ? o2.compareTo(o1) : rsl;
    }
}
