package com.wzn.event;

import java.util.List;

public class EventSource {
    private List<MyEventListenerInterface> listeners;

    void addEventListener(MyEventListenerInterface listener) {
        listeners.add(listener);
    }

    void removeEventListener(MyEventListenerInterface listener) {
        listeners.remove(listener);
    }

    void detectEvent() {
        if (listeners.isEmpty()) {
            System.out.println("no listener");
            return;
        }
        System.out.println("listening...");

    }

    void notifyListeners(EventMsg event) {
        for (MyEventListenerInterface myEventListenerInterface : listeners) {
            myEventListenerInterface.handleEvent(event);
        }
    }

}
