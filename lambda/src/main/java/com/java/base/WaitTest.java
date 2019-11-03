package com.java.base;

import com.stream.Traders;

public class WaitTest {
    public static void main(String[] args) throws InterruptedException {
        Traders traders=Traders.builder().build();
        traders.wait();

    }
}
