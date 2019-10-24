package com.singleton;

public class ClassLazyInit {
    public static void main(String[] args) {

        System.out.println(Collection.class.hashCode());
        System.out.println(Collection.flag);
    }
    static class Collection{
        static boolean flag=true;
        static{
            System.out.println("Collection init...");
        }
    }
}
