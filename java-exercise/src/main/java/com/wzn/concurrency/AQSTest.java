package com.wzn.concurrency;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class AQSTest extends AbstractQueuedSynchronizer {

}

class OneLatch {
    Sync sync = new Sync();

    public void siginal() {
        sync.releaseShared(0);
    }
    public void await() throws InterruptedException {
        sync.acquireInterruptibly(0);
    }

}

class Sync extends AbstractQueuedSynchronizer {

    @Override
    protected boolean tryReleaseShared(int arg) {
        setState(1);
        return true;
    }

    @Override
    protected int tryAcquireShared(int arg) {
        return getState() == 1 ? 1 : -1;
    }

}
