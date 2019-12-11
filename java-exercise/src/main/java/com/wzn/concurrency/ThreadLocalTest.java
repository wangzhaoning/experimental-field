package com.wzn.concurrency;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class ThreadLocalTest {
    private static ThreadLocal<Connection> threadLocal = ThreadLocal.withInitial(() -> {
        try {
            return DriverManager.getConnection("url");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    });

    public static void main(String[] args) {
        threadLocal.get();
        threadLocal.set(null);
        threadLocal.remove();
    }
}

class SimpleThreadLocal {
    static Map<String, String> map = new ConcurrentHashMap<>();
    private static CountDownLatch latch = new CountDownLatch(5);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            int value = i;
            new Thread(() -> {
                map.put(Thread.currentThread().getName(), Integer.toString(value));
                latch.countDown();
            }).start();
        }
        latch.await();
        System.out.println(map);
    }
}
