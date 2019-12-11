package com.wzn.event;

public class MyEventListenerClass implements  MyEventListenerInterface{
    @Override
    public void handleEvent(EventMsg event) {
        System.out.println(String.format(" MyEventListenerClass  %s" ,event));
    }
}
