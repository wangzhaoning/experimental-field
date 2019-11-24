package com.wzn.enumtest;

public enum InstanceType {
    /**
     * 集群
     */
    CLUSTER{
        @Override
        public void setServiceFactoryRoutingKey(Integer i){
            super.setServiceFactoryRoutingKey(i);
            System.out.println(i);
        }
    },
    /**
     * 高可用
     */
    HA{
        @Override
        public void setServiceFactoryRoutingKey(Integer i){
            System.out.println(123);
        }
    };

    public void setServiceFactoryRoutingKey(Integer i){
        System.out.println("hello world");
    }
}
