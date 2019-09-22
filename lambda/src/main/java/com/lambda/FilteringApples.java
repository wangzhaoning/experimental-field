package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringApples {
    public interface Predicate<T> {
        boolean test(T t);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Apples> list = new ArrayList<>(Arrays.asList(new Apples(10, "red"),
                new Apples(150, "green")));
        List<Apples> redApples = filter(list,(Apples apple)->
           "red".equals(apple.getColor()));
        System.out.println(redApples);
    }
}
