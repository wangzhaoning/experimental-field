package com.wzn.concurrency;

public class VolatileTest {
    private static boolean ready;
    private static int i;

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
