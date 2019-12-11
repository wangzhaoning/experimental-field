package com.wzn.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {
    public static void main(String[] args) {
        List<String> vpcIps = new ArrayList<>(Arrays.asList("12.123.3.100","12.123.3.88","12.123.3.111"));
        List<String> collect = vpcIps.stream().sorted(Comparator.comparing((a)-> Integer.valueOf(a.split("\\.")[3]))) .collect(Collectors.toList());
        System.out.println(collect);
    }
}
