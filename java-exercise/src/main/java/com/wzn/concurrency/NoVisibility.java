package com.wzn.concurrency;

public class NoVisibility {
    private volatile static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            while (!ready) ;
            System.out.println(number);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ReaderThread().start();
        Thread.sleep(1000);
        number = 42;
        ready = true;
        Thread.sleep(10000);
    }
}

class Order {
    static int a = 0, b = 0;
    static int x = 0, y = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread one =new Thread(()->{
            a=1;
            x=b;
        });
        Thread two = new Thread(()->{
            b=1;
            y=a;
        });
        one.start();
        two.start();
        one.join();
        two.join();
        System.out.println(a+" "+b+" "+x+" "+y+" ");
    }
}
