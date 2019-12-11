package com.wzn.concurrency;

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newCachedThreadPool();
        RejectedExecutionHandler rejectedExecutionHandler = (r, executor) ->
                executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());

    }
}
