package com.wzn.realtime.exercise;

import java.lang.reflect.Field;

public class ChangeValue {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        int a = 10;
        int b = 10;
        method(a, b);
        System.out.println("a=" + a + " b=" + b);
    }

    private static void method(Integer a, Integer b) throws NoSuchFieldException, IllegalAccessException {
        Field f = Integer.class.getDeclaredField("value");
        f.setAccessible(true);
//        f.setInt(a, 100);
//        f.setInt(b, 200);
        int a1 = new Integer(100);
        int a2 = new Integer(200);
        f.setInt(a, a1);
        f.setInt(b, a2);
    }
}
