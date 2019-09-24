package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaClassTest
//    implements Comparator<Apples>
{
//    @Override
//    public int compare(Apples o1, Apples o2) {
//        return o1.getWeight().compareTo(o2.getWeight())  ;
//    }

    public static void main(String[] args) {
        List<Apples> list = new ArrayList<>(Arrays.asList(new Apples(133,"orange"),
                new Apples(10, "red"),
                new Apples(150, "green")));
//        list.sort(new LambdaClassTest());
        System.out.println(list);
        list.sort((o1, o2) -> o1.getWeight().compareTo(o2.getWeight()));
    }
}
