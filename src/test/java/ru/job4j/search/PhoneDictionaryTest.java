package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk"));
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindByPhone() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk"));
        var persons = phones.find("534");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindByAdress() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk"));
        var persons = phones.find("Bryan");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenNoFind() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk"));
        var persons = phones.find("Moskow");
        assertThat(persons.size(), is(0));
    }
}