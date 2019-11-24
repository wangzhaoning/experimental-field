package com.wzn.realtime.exercise;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, i);
        }
        for (int i = 6; i < 18; i++) {
            map.put(i, i + 1);
        }
        System.out.println(map);

        map.get(1);

        "qinxiaoyu".getBytes();
    }
}
