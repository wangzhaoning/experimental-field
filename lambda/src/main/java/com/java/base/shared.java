package com.java.base;

public class Shared {
    private Shared(){
        System.out.println("Share "+this);
    }

    public static void main(String[] args) {
        new Shared();
    }

    @Override
    public String toString(){
        return "test";
    }
}
