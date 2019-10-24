package com.concurrency;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.Executors.newScheduledThreadPool;

public class ScheduledTime {
    public static void main(String[] args) {
        ScheduledExecutorService service = newScheduledThreadPool(5);
        service.schedule(task, 10, TimeUnit.SECONDS);
    }

    private static Runnable task = () -> System.out.println("test");
}
