package ru.job4j.stream;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void testCollect() {
        Address adr1 = new Address("Moscow", "Lenina", 12, 26);
        Address adr2 = new Address("Moscow", "Lenina", 14, 28);
        List<Profile> profiles = Arrays.asList(new Profile(adr1), new Profile(adr2));
        Profiles prof = new Profiles();
        List<Address> result = prof.collect(profiles);
        List<Address> expected = Arrays.asList(adr1, adr2);
        assertThat(result, Matchers.is(expected));
    }
}