package com.wzn.event;

public class TestEventHandle {
    public static void main(String[] args) {
        MyEventListenerInterface myEventListener = new MyEventListenerClass();
        EventSource eventSource = new EventSource();
        EventMsg eventMsg =new EventMsg(eventSource,"a message");
        myEventListener.handleEvent(eventMsg);
    }
}
