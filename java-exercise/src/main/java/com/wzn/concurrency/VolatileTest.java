package com.wzn.concurrency;

import java.sql.SQLOutput;

public class VolatileTest {
    private static boolean ready = false;
    private static int i = 0;

    private static class ReadThread extends Thread {
        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ReadThread().start();
        Thread.sleep(1000);
        i = 20;
        ready = true;
    }
}

class volatileDemo{
    private static Integer i = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            i = 100;
        }).start();
        Thread.sleep(10);
        System.out.println(i);
    }
}
