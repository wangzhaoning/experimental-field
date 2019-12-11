package com.wzn.event;


import java.util.EventObject;

public class EventMsg extends EventObject {
    private String eventMsg;
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public EventMsg(Object source) {
        super(source);
    }

    public EventMsg(Object source,String eventMsg) {
        this(source);
        this.eventMsg = eventMsg;
    }



    public String getEventMsg() {
        return eventMsg;
    }

    public void setEventMsg(String eventMsg) {
        this.eventMsg = eventMsg;
    }

    @Override
    public String toString(){
        return "eventMsg :"+eventMsg;
    }
}





