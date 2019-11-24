package com.wzn.concurrency;

import java.util.concurrent.*;

public class UseThreadFuture {
    private static Callable<String> task = new Callable<String>() {
        @Override
        public String call() throws Exception {
            return "test";
        }
    };
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    Future<String> future = executorService.submit(task);
    String hostInfo = future.get(100, TimeUnit.SECONDS);
        System.out.println(hostInfo);
    }

}
