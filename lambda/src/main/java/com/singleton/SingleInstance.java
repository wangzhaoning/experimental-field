package com.singleton;

public class SingleInstance {
        private static final SingleInstance instance=new SingleInstance();
    private SingleInstance(){}

        public SingleInstance getInstance(){
            return instance;
        }
}
