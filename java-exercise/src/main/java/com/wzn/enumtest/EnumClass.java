package com.wzn.enumtest;

public class EnumClass {
    public static void main(String[] args) {
        for (EnumType e : EnumType.values()) {
            System.out.println(e.ordinal());
        }

        String shrub = "CREATE RESTART DELETE";
        String[] shrubs = shrub.split("\\s+");
        for (String s : shrubs) {
            System.out.println(Enum.valueOf(EnumType.class, s));
        }
    }
}

enum EnumType {
    //
    CREATE, DELETE, RESTART
}
