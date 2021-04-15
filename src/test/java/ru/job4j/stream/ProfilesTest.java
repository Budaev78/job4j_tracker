package ru.job4j.stream;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;

public class ProfilesTest {

    @Test
    public void testCollect() {
        Address adr1 = new Address("Moscow", "Lenina", 12, 26);
        Address adr2 = new Address("Moscow", "Lenina", 14, 28);
        Address adr3 = new Address("SPb", "Popova", 24, 15);
        Address adr4 = new Address("Kazan", "Novgorodskaya", 2, 102);
        Address adr5 = new Address("SPb", "Chkalovskiy", 35, 3);
        List<Profile> profiles = Arrays.asList(new Profile(adr1), new Profile(adr2),
                new Profile(adr3), new Profile(adr4), new Profile(adr5));
        Profiles prof = new Profiles();
        List<Address> result = prof.collect(profiles);
        List<Address> expected = Arrays.asList(adr4, adr1, adr2, adr3, adr5);
        assertThat(result, Matchers.is(expected));
    }
}