package com.wzn.event;

import java.util.EventListener;

public interface MyEventListenerInterface  extends EventListener {
    public void handleEvent(EventMsg event);
}
