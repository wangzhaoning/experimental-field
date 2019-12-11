package com.wzn.event;

public class AnotherListener  implements  MyEventListenerInterface{
    @Override
    public void handleEvent(EventMsg event) {
        System.out.println(String.format("AnotherListener  %s" ,event));
    }
}
