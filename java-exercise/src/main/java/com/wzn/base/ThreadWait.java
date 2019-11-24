package com.wzn.base;

import com.wzn.stream.BeanOfTraders;

public class ThreadWait {
    public static void main(String[] args) throws InterruptedException {
        BeanOfTraders traders= BeanOfTraders.builder().build();
        traders.wait();

    }
}
