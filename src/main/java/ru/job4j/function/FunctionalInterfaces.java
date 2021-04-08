package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "three", 4, "four",
                5, "five", 6, "six", 7, "seven");
        BiConsumer<Integer, String> biCon = (i, s) -> System.out.println(i + ":" + s);
        map.forEach(biCon);

        BiPredicate<Integer, String> biPred1 = (i, s) -> i % 2 == 0;
        BiPredicate<Integer, String> biPred2 = (i, s) -> map.get(i).length() == 4;
        for (Integer i : map.keySet()) {
            if (biPred1.test(i, map.get(i)) || biPred2.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }

        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        List<String> strings = sup.get();
        for (String s : strings) {
            System.out.println(s);
        }

        Consumer<String> con = (s) -> System.out.println(s);
        Function<String, String> func = (s) -> s.toUpperCase();
        for (String s : strings) {
            System.out.println(func.apply(s));
        }
    }
}
