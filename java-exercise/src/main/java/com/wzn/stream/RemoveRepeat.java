package com.wzn.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

public class RemoveRepeat {
    public static void main(String[] args) {
        List<BeanOfTraders> result = new ArrayList<>();
        BeanOfTraders beanOfTraders1 = BeanOfTraders.builder().age(12).city("Aa").build();
        BeanOfTraders beanOfTraders2 = BeanOfTraders.builder().age(11).city("BB").build();
        BeanOfTraders beanOfTraders3 = BeanOfTraders.builder().age(12).city("Ba").build();
        BeanOfTraders beanOfTraders4 = BeanOfTraders.builder().age(12).city("CB").build();
        BeanOfTraders beanOfTraders5 =BeanOfTraders.builder().age(12).city("Ca").build();
        BeanOfTraders beanOfTraders6 =
                BeanOfTraders.builder().age(12).city("DB").build();

        result.add(beanOfTraders1);
        result.add(beanOfTraders2);
        result.add(beanOfTraders3);
        result.add(beanOfTraders4);
        result.add(beanOfTraders5);
        result.add(beanOfTraders6);

        List<BeanOfTraders> resultList = result.stream().collect(
                collectingAndThen(toCollection(() -> new TreeSet<>(comparing(BeanOfTraders::getCity))), ArrayList::new));
        System.out.println(resultList);
        System.out.println(resultList.size());
    }
}
