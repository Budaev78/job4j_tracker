package ru.job4j.stream;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;

public class MatrixTest {

    @Test
    public void testCollect() {
        Integer[][] array = new Integer[][]{{1, 2, 3}, {4, 5, 6}};
        Matrix matrix = new Matrix();
        List<Integer> result = matrix.collect(array);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertThat(result, Matchers.is(expected));
    }
}