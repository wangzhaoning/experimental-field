package com.wzn.base;

public class TryThisKey {
    private TryThisKey(){
        System.out.println("Share "+this);
    }

    public static void main(String[] args) {
        new TryThisKey();
    }

    @Override
    public String toString(){
        return "test";
    }
}
