package com.wzn.realtime.exercise;

import java.util.ArrayList;
import java.util.List;

public class toStringTest {
    public static void main(String[] args) {
        List<String> managementIps=new ArrayList<>();
        managementIps.add("127.0.0.1");
        managementIps.add("122.5.2.3");
        StringBuilder builderIps=new StringBuilder();
        for(String managementIp:managementIps){
            builderIps.append(managementIp);
            builderIps.append(" ");
        }
        builderIps.deleteCharAt(builderIps.length()-1);
        System.out.println(builderIps.toString());
    }
}
