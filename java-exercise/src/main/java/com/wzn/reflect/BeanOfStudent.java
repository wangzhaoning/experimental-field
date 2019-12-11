package com.wzn.reflect;

import java.util.HashMap;
import java.util.Map;

public class BeanOfStudent {
    private static BeanOfStudent student = new BeanOfStudent();
    private String name;
    private int age;
    private Map<Integer, Integer> map = new HashMap<>();

    public Map<Integer, Integer> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Integer> map) {
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("hello");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void method1(int param1, String param2) {
        System.out.println(param1 + param2);
    }

}