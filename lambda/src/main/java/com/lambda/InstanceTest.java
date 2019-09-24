package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InstanceTest {
    private void fliter(Apples apples){
        System.out.println("test");
    }

    public static void main(String[] args) {
        List<Apples> list = new ArrayList<>(Arrays.asList(new Apples(10, "red"),
                new Apples(150, "green")));
        list.forEach(
                apples -> new InstanceTest().fliter(apples)
        );
    }
}
