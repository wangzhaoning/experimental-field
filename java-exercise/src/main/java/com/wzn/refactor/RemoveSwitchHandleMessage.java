package com.wzn.refactor;

import java.util.Map;
import java.util.function.BiConsumer;

public class RemoveSwitchHandleMessage {
    HandleService handleService;
    void process(OperationType type){
        type.handleMessageHandler(handleService);
    }
}

enum OperationType {
    /**
     *  Instance operation
     */
    DELETE{
        @Override
        void handleMessageHandler(HandleService handleService){
            handleService.handleDelete();
        }
    },
    CREATE{
        @Override
        void handleMessageHandler(HandleService handleService){
            handleService.handleCreate();
        }
    },
    START{
        @Override
        void handleMessageHandler(HandleService handleService){
            handleService.handleStart();
        }
    };

    abstract void handleMessageHandler(HandleService handleService);
}

enum EnumType{
    /**
     *
     */
    CREATE(HandleService::handleCreate),
    START(HandleService::handleStart),
    DELETE(HandleService::handleDelete);

    public void handleMessage(HandleService handleService,Map map) {
        consumer.accept(handleService,map);
    }

    private BiConsumer<HandleService,Map> consumer;

    EnumType(BiConsumer<HandleService, Map> consumer) {
        this.consumer = consumer;
    }
}