package com.wzn.concurrency;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedAction {
    Integer value;
    Map<String,Integer> map = new ConcurrentHashMap<>();
    public static synchronized void doSomething() {
            System.out.println("doSomething ...");
    }
}
