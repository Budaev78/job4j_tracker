package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStream {
    private List<Integer> source = new ArrayList<>();

    public static EasyStream of(List<Integer> source) {
        EasyStream easyStream = new EasyStream();
        easyStream.source = source;
        return easyStream;
    }

    public EasyStream map(Function<Integer, Integer> fun) {
        List<Integer> rsl = new ArrayList<>();
        for (Integer num : source) {
            rsl.add(fun.apply(num));
        }
        return EasyStream.of(rsl);
    }

    public EasyStream filter(Predicate<Integer> fun) {
        List<Integer> rsl = new ArrayList<>();
        for (Integer num : source) {
            if (fun.test(num)) {
                rsl.add(num);
            }
        }
        return EasyStream.of(rsl);
    }

    public List<Integer> collect() {
        return new ArrayList<>(source);
    }
}