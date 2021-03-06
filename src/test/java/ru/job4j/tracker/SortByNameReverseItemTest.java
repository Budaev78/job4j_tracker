package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

public class SortByNameReverseItemTest {

    @Test
    public void testThenComparing() {
        List<Item> items = Arrays.asList(
                new Item(3, "car"),
                new Item(1, "fly"),
                new Item(6, "train")
        );
        Collections.sort(items, new SortByNameReverseItem());
        assertThat(items, is(Arrays.asList(new Item(6, "train"), new Item(1, "fly"),
                new Item(3, "car"))));
    }
}