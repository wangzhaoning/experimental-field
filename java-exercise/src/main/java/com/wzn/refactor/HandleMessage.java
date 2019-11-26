package com.wzn.refactor;

import java.util.Map;

public class HandleMessage {
    private HandleService handle;
    public void process(Type type) {
        switch (type) {
            case CREATE:
                handle.handleCreate();
                break;
            case DELETE:
                handle.handleDelete();
                break;
            case START:
                handle.handleStart();
                break;
            default:
        }
    }
}
enum Type {
    /**
     *  Instance operation
     */
    DELETE,
    CREATE,
    START
}

class HandleService {
    static void handleCreate(){
        System.out.println("handleCreate");
    }
    void handleDelete(){
        System.out.println("handleDelete");
    }
    void handleStart(){
        System.out.println("handleStart");
    }

    public void handleCreate(Map map) {
    }
    public void handleDelete(Map map) {
    }
    public void handleStart(Map map) {
    }
}


