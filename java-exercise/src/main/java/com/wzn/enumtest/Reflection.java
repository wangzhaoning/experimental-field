package com.wzn.enumtest;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

public class Reflection {

    private static Set<String> anaylize(Class<?> thisClass) {
        System.out.println("thisClass  is  " + thisClass);
        thisClass.getSuperclass();

        for (Type t : thisClass.getGenericInterfaces()) {
            System.out.println(t);
        }
        System.out.println("Base: " + thisClass.getSuperclass());
        System.out.println("Methods: ");
        Set<String> methods = new TreeSet<>();
        for (Method m : thisClass.getMethods()) {
            methods.add(m.getName());
        }
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) {
        anaylize(Explore.class);
        System.out.println("------------------------");
        anaylize(Enum.class);
    }

}

enum Explore {
    /**
     *
     */
    TJAT, THIS
}
