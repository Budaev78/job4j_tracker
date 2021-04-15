package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) throws IndexOutOfBoundsException {
        Predicate<Person> comb1 = p -> p.getName().contains(key);
        Predicate<Person> comb2 = p -> p.getPhone().contains(key);
        Predicate<Person> comb3 = p -> p.getSurname().contains(key);
        Predicate<Person> comb4 = p -> p.getAddress().contains(key);
        var combine = comb1.or(comb2).or(comb3).or(comb4);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
