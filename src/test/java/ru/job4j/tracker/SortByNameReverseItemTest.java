package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortByNameReverseItemTest {

    @Test
    public void testThenComparing() {
        SortByNameReverseItem comparator = new SortByNameReverseItem();
        Assert.assertEquals(comparator.compare(new Item(3, "car"), new Item(1, "fly")), 3);
    }
}