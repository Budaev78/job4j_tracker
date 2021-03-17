package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

public class SortByIdItemTest  {

    @Test
    public void testThenComparing() {
        SortByIdItem comparator = new SortByIdItem();
        Assert.assertEquals(comparator.compare(new Item(3, "car"), new Item(1, "fly")), 2);
    }
}