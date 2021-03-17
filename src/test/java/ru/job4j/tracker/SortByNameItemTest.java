package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortByNameItemTest  {

    @Test
    public void testThenComparing() {
        SortByNameItem comparator = new SortByNameItem();
        Assert.assertEquals(comparator.compare(new Item(3, "car"), new Item(1, "fly")), -3);
    }
}
