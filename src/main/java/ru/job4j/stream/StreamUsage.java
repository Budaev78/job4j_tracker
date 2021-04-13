package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 15, 16, 20);
        List<Integer> evenNum = numbers.stream().filter(
                num -> num % 2 == 0
        ).collect(Collectors.toList());
    }
}
