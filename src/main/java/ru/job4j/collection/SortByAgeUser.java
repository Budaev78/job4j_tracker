package ru.job4j.collection;

import java.util.Comparator;

public class SortByAgeUser implements Comparator<User> {

    @Override
    public int compare(User first, User second) {
        return first.getAge() - second.getAge();
    }
}
